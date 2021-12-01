package bsh.util;

import bsh.BshClassManager;
import bsh.StringUtil;
import bsh.classpath.BshClassPath;
import bsh.classpath.ClassManagerImpl;
import bsh.classpath.ClassPathListener;
import bsh.org.objectweb.asm.Constants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class ClassBrowser extends JSplitPane implements ListSelectionListener, ClassPathListener {
    private static final Color LIGHT_BLUE = new Color(245, 245, 255);
    BshClassManager classManager;
    BshClassPath classPath;
    String[] classesList;
    JList classlist;
    Constructor[] consList;
    JList conslist;
    Field[] fieldList;
    JList fieldlist;
    JFrame frame;
    JInternalFrame iframe;
    JTextArea methodLine;
    Method[] methodList;
    JList mlist;
    String[] packagesList;
    PackageTree ptree;
    Class selectedClass;
    String selectedPackage;
    JTree tree;

    /* access modifiers changed from: package-private */
    public class PackageTree extends JTree {
        Map nodeForPackage = new HashMap();
        TreeNode root;
        DefaultTreeModel treeModel;

        PackageTree(Collection collection) {
            setPackages(collection);
            setRootVisible(false);
            setShowsRootHandles(true);
            setExpandsSelectedPaths(true);
        }

        /* access modifiers changed from: package-private */
        public void addNodeMap(TreeNode treeNode) {
            StringBuffer stringBuffer = new StringBuffer();
            for (TreeNode treeNode2 = treeNode; treeNode2 != this.root; treeNode2 = treeNode2.getParent()) {
                stringBuffer.insert(0, treeNode2.toString());
                if (treeNode2.getParent() != this.root) {
                    stringBuffer.insert(0, ".");
                }
            }
            this.nodeForPackage.put(stringBuffer.toString(), treeNode);
        }

        /* access modifiers changed from: package-private */
        public MutableTreeNode makeNode(Map map, String str) {
            DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(str);
            for (String str2 : map.keySet()) {
                Map map2 = (Map) map.get(str2);
                if (map2.size() == 0) {
                    defaultMutableTreeNode.add(new DefaultMutableTreeNode(str2));
                } else {
                    defaultMutableTreeNode.add(makeNode(map2, str2));
                }
            }
            return defaultMutableTreeNode;
        }

        /* access modifiers changed from: package-private */
        public DefaultTreeModel makeTreeModel(Collection collection) {
            HashMap hashMap = new HashMap();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String[] split = StringUtil.split((String) it.next(), ".");
                HashMap hashMap2 = hashMap;
                for (String str : split) {
                    Map map = (Map) hashMap2.get(str);
                    if (map == null) {
                        map = new HashMap();
                        hashMap2.put(str, map);
                    }
                    hashMap2 = map;
                }
            }
            MutableTreeNode makeNode = makeNode(hashMap, "root");
            this.root = makeNode;
            mapNodes(makeNode);
            return new DefaultTreeModel(this.root);
        }

        /* access modifiers changed from: package-private */
        public void mapNodes(TreeNode treeNode) {
            addNodeMap(treeNode);
            Enumeration children = treeNode.children();
            while (children.hasMoreElements()) {
                mapNodes((TreeNode) children.nextElement());
            }
        }

        public void setPackages(Collection collection) {
            DefaultTreeModel makeTreeModel = makeTreeModel(collection);
            this.treeModel = makeTreeModel;
            setModel(makeTreeModel);
        }

        /* access modifiers changed from: package-private */
        public void setSelectedPackage(String str) {
            DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode) this.nodeForPackage.get(str);
            if (defaultMutableTreeNode != null) {
                TreePath treePath = new TreePath(this.treeModel.getPathToRoot(defaultMutableTreeNode));
                setSelectionPath(treePath);
                ClassBrowser.this.setClist(str);
                scrollPathToVisible(treePath);
            }
        }
    }

    public ClassBrowser() {
        this(BshClassManager.createClassManager(null));
    }

    public ClassBrowser(BshClassManager bshClassManager) {
        super(0, true);
        this.classManager = bshClassManager;
        setBorder(null);
        BasicSplitPaneUI ui = getUI();
        if (ui instanceof BasicSplitPaneUI) {
            ui.getDivider().setBorder((Border) null);
        }
    }

    public static void main(String[] strArr) {
        ClassBrowser classBrowser = new ClassBrowser();
        classBrowser.init();
        JFrame jFrame = new JFrame("BeanShell Class Browser v1.0");
        jFrame.getContentPane().add("Center", classBrowser);
        classBrowser.setFrame(jFrame);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private JSplitPane splitPane(int i, boolean z, JComponent jComponent, JComponent jComponent2) {
        JSplitPane jSplitPane = new JSplitPane(i, z, jComponent, jComponent2);
        jSplitPane.setBorder((Border) null);
        BasicSplitPaneUI ui = jSplitPane.getUI();
        if (ui instanceof BasicSplitPaneUI) {
            ui.getDivider().setBorder((Border) null);
        }
        return jSplitPane;
    }

    @Override // bsh.classpath.ClassPathListener
    public void classPathChanged() {
        this.ptree.setPackages(this.classPath.getPackagesSet());
        setClist(null);
    }

    public void driveToClass(String str) {
        String[] splitClassname = BshClassPath.splitClassname(str);
        int i = 0;
        String str2 = splitClassname[0];
        String str3 = splitClassname[1];
        if (this.classPath.getClassesForPackage(str2).size() != 0) {
            this.ptree.setSelectedPackage(str2);
            while (true) {
                String[] strArr = this.classesList;
                if (i < strArr.length) {
                    if (strArr[i].equals(str3)) {
                        this.classlist.setSelectedIndex(i);
                        this.classlist.ensureIndexIsVisible(i);
                        return;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Constructor[] getPublicConstructors(Constructor[] constructorArr) {
        Vector vector = new Vector();
        for (int i = 0; i < constructorArr.length; i++) {
            if (Modifier.isPublic(constructorArr[i].getModifiers())) {
                vector.addElement(constructorArr[i]);
            }
        }
        Constructor[] constructorArr2 = new Constructor[vector.size()];
        vector.copyInto(constructorArr2);
        return constructorArr2;
    }

    /* access modifiers changed from: package-private */
    public Field[] getPublicFields(Field[] fieldArr) {
        Vector vector = new Vector();
        for (int i = 0; i < fieldArr.length; i++) {
            if (Modifier.isPublic(fieldArr[i].getModifiers())) {
                vector.addElement(fieldArr[i]);
            }
        }
        Field[] fieldArr2 = new Field[vector.size()];
        vector.copyInto(fieldArr2);
        return fieldArr2;
    }

    /* access modifiers changed from: package-private */
    public Method[] getPublicMethods(Method[] methodArr) {
        Vector vector = new Vector();
        for (int i = 0; i < methodArr.length; i++) {
            if (Modifier.isPublic(methodArr[i].getModifiers())) {
                vector.addElement(methodArr[i]);
            }
        }
        Method[] methodArr2 = new Method[vector.size()];
        vector.copyInto(methodArr2);
        return methodArr2;
    }

    public void init() {
        BshClassPath classPath2 = ((ClassManagerImpl) this.classManager).getClassPath();
        this.classPath = classPath2;
        classPath2.addListener(this);
        PackageTree packageTree = new PackageTree(this.classPath.getPackagesSet());
        this.ptree = packageTree;
        packageTree.addTreeSelectionListener(new TreeSelectionListener() {
            /* class bsh.util.ClassBrowser.C09771 */

            public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
                Object[] path = treeSelectionEvent.getPath().getPath();
                StringBuffer stringBuffer = new StringBuffer();
                int i = 1;
                while (i < path.length) {
                    stringBuffer.append(path[i].toString());
                    i++;
                    if (i < path.length) {
                        stringBuffer.append(".");
                    }
                }
                ClassBrowser.this.setClist(stringBuffer.toString());
            }
        });
        JList jList = new JList();
        this.classlist = jList;
        Color color = LIGHT_BLUE;
        jList.setBackground(color);
        this.classlist.addListSelectionListener(this);
        JList jList2 = new JList();
        this.conslist = jList2;
        jList2.addListSelectionListener(this);
        JList jList3 = new JList();
        this.mlist = jList3;
        jList3.setBackground(color);
        this.mlist.addListSelectionListener(this);
        JList jList4 = new JList();
        this.fieldlist = jList4;
        jList4.addListSelectionListener(this);
        JSplitPane splitPane = splitPane(1, true, labeledPane(new JScrollPane(this.ptree), "Packages"), splitPane(1, true, labeledPane(new JScrollPane(this.classlist), "Classes"), splitPane(0, true, splitPane(0, true, labeledPane(new JScrollPane(this.conslist), "Constructors"), labeledPane(new JScrollPane(this.mlist), "Methods")), labeledPane(new JScrollPane(this.fieldlist), "Fields"))));
        JPanel jPanel = new JPanel(new BorderLayout());
        JTextArea jTextArea = new JTextArea(1, 60);
        this.methodLine = jTextArea;
        jTextArea.setBackground(color);
        this.methodLine.setEditable(false);
        this.methodLine.setLineWrap(true);
        this.methodLine.setWrapStyleWord(true);
        this.methodLine.setFont(new Font("Monospaced", 1, 14));
        this.methodLine.setMargin(new Insets(5, 5, 5, 5));
        this.methodLine.setBorder(new MatteBorder(1, 0, 1, 0, color.darker().darker()));
        jPanel.add("North", this.methodLine);
        JPanel jPanel2 = new JPanel(new BorderLayout());
        JTree jTree = new JTree();
        this.tree = jTree;
        jTree.addTreeSelectionListener(new TreeSelectionListener() {
            /* class bsh.util.ClassBrowser.C09782 */

            public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
                ClassBrowser.this.driveToClass(treeSelectionEvent.getPath().getLastPathComponent().toString());
            }
        });
        this.tree.setBorder(BorderFactory.createRaisedBevelBorder());
        setClassTree(null);
        jPanel2.add("Center", this.tree);
        jPanel.add("Center", jPanel2);
        jPanel.setPreferredSize(new Dimension((int) Constants.FCMPG, (int) Constants.FCMPG));
        setTopComponent(splitPane);
        setBottomComponent(jPanel);
    }

    /* access modifiers changed from: package-private */
    public JPanel labeledPane(JComponent jComponent, String str) {
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.add("Center", jComponent);
        jPanel.add("North", new JLabel(str, 0));
        return jPanel;
    }

    /* access modifiers changed from: package-private */
    public String[] parseConstructors(Constructor[] constructorArr) {
        int length = constructorArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Constructor constructor = constructorArr[i];
            strArr[i] = StringUtil.methodString(constructor.getName(), constructor.getParameterTypes());
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    public String[] parseFields(Field[] fieldArr) {
        int length = fieldArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = fieldArr[i].getName();
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    public String[] parseMethods(Method[] methodArr) {
        int length = methodArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = StringUtil.methodString(methodArr[i].getName(), methodArr[i].getParameterTypes());
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    public void setClassTree(Class cls) {
        MutableTreeNode defaultMutableTreeNode;
        MutableTreeNode mutableTreeNode = null;
        if (cls == null) {
            this.tree.setModel((TreeModel) null);
            return;
        }
        MutableTreeNode mutableTreeNode2 = null;
        while (true) {
            defaultMutableTreeNode = new DefaultMutableTreeNode(cls.toString());
            if (mutableTreeNode != null) {
                defaultMutableTreeNode.add(mutableTreeNode);
            } else {
                mutableTreeNode2 = defaultMutableTreeNode;
            }
            cls = cls.getSuperclass();
            if (cls == null) {
                break;
            }
            mutableTreeNode = defaultMutableTreeNode;
        }
        this.tree.setModel(new DefaultTreeModel(defaultMutableTreeNode));
        TreeNode parent = mutableTreeNode2.getParent();
        if (parent != null) {
            this.tree.expandPath(new TreePath(this.tree.getModel().getPathToRoot(parent)));
        }
    }

    /* access modifiers changed from: package-private */
    public void setClist(String str) {
        this.selectedPackage = str;
        Set<String> classesForPackage = this.classPath.getClassesForPackage(str);
        if (classesForPackage == null) {
            classesForPackage = new HashSet();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : classesForPackage) {
            if (str2.indexOf("$") == -1) {
                arrayList.add(BshClassPath.splitClassname(str2)[1]);
            }
        }
        String[] sortedStrings = toSortedStrings(arrayList);
        this.classesList = sortedStrings;
        this.classlist.setListData(sortedStrings);
    }

    /* access modifiers changed from: package-private */
    public void setConslist(Class cls) {
        if (cls == null) {
            this.conslist.setListData(new Object[0]);
            return;
        }
        Constructor[] publicConstructors = getPublicConstructors(cls.getDeclaredConstructors());
        this.consList = publicConstructors;
        this.conslist.setListData(parseConstructors(publicConstructors));
    }

    /* access modifiers changed from: package-private */
    public void setFieldList(Class cls) {
        if (cls == null) {
            this.fieldlist.setListData(new Object[0]);
            return;
        }
        Field[] publicFields = getPublicFields(cls.getDeclaredFields());
        this.fieldList = publicFields;
        this.fieldlist.setListData(parseFields(publicFields));
    }

    public void setFrame(JFrame jFrame) {
        this.frame = jFrame;
    }

    public void setFrame(JInternalFrame jInternalFrame) {
        this.iframe = jInternalFrame;
    }

    /* access modifiers changed from: package-private */
    public void setMethodLine(Object obj) {
        this.methodLine.setText(obj == null ? "" : obj.toString());
    }

    /* access modifiers changed from: package-private */
    public void setMlist(String str) {
        Class classForName;
        if (str == null) {
            this.mlist.setListData(new Object[0]);
            setConslist(null);
            setClassTree(null);
            return;
        }
        try {
            if (this.selectedPackage.equals("<unpackaged>")) {
                classForName = this.classManager.classForName(str);
            } else {
                BshClassManager bshClassManager = this.classManager;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(this.selectedPackage);
                stringBuffer.append(".");
                stringBuffer.append(str);
                classForName = bshClassManager.classForName(stringBuffer.toString());
            }
            this.selectedClass = classForName;
            Class cls = this.selectedClass;
            if (cls == null) {
                PrintStream printStream = System.err;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("class not found: ");
                stringBuffer2.append(str);
                printStream.println(stringBuffer2.toString());
                return;
            }
            Method[] publicMethods = getPublicMethods(cls.getDeclaredMethods());
            this.methodList = publicMethods;
            this.mlist.setListData(parseMethods(publicMethods));
            setClassTree(this.selectedClass);
            setConslist(this.selectedClass);
            setFieldList(this.selectedClass);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void toFront() {
        JFrame jFrame = this.frame;
        if (jFrame != null) {
            jFrame.toFront();
            return;
        }
        JInternalFrame jInternalFrame = this.iframe;
        if (jInternalFrame != null) {
            jInternalFrame.toFront();
        }
    }

    /* access modifiers changed from: package-private */
    public String[] toSortedStrings(Collection collection) {
        return StringUtil.bubbleSort((String[]) new ArrayList(collection).toArray(new String[0]));
    }

    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        String str;
        Object source = listSelectionEvent.getSource();
        JList jList = this.classlist;
        if (source == jList) {
            String str2 = (String) jList.getSelectedValue();
            setMlist(str2);
            if (str2 == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Package: ");
                stringBuffer.append(this.selectedPackage);
                str = stringBuffer.toString();
            } else {
                if (!this.selectedPackage.equals("<unpackaged>")) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(this.selectedPackage);
                    stringBuffer2.append(".");
                    stringBuffer2.append(str2);
                    str2 = stringBuffer2.toString();
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(str2);
                stringBuffer3.append(" (from ");
                stringBuffer3.append(this.classPath.getClassSource(str2));
                stringBuffer3.append(")");
                str = stringBuffer3.toString();
            }
        } else {
            Object source2 = listSelectionEvent.getSource();
            JList jList2 = this.mlist;
            if (source2 == jList2) {
                int selectedIndex = jList2.getSelectedIndex();
                if (selectedIndex != -1) {
                    str = this.methodList[selectedIndex];
                }
            } else {
                Object source3 = listSelectionEvent.getSource();
                JList jList3 = this.conslist;
                if (source3 == jList3) {
                    int selectedIndex2 = jList3.getSelectedIndex();
                    if (selectedIndex2 != -1) {
                        str = this.consList[selectedIndex2];
                    }
                } else {
                    Object source4 = listSelectionEvent.getSource();
                    JList jList4 = this.fieldlist;
                    if (source4 == jList4) {
                        int selectedIndex3 = jList4.getSelectedIndex();
                        if (selectedIndex3 != -1) {
                            str = this.fieldList[selectedIndex3];
                        }
                    } else {
                        return;
                    }
                }
            }
            setMethodLine(null);
            return;
        }
        setMethodLine(str);
    }
}
