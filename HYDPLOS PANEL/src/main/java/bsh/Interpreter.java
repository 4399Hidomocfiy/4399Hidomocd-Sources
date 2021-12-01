package bsh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Interpreter implements Runnable, ConsoleInterface, Serializable {
    public static boolean DEBUG = false;
    public static boolean LOCALSCOPING = false;
    public static boolean TRACE = false;
    public static final String VERSION = "2.0b4";
    static /* synthetic */ Class array$Ljava$lang$String = null;
    static transient PrintStream debug = null;
    static This sharedObject = null;
    static String systemLineSeparator = "\n";
    ConsoleInterface console;
    transient PrintStream err;
    protected boolean evalOnly;
    private boolean exitOnEOF;
    NameSpace globalNameSpace;

    /* renamed from: in */
    transient Reader f2118in;
    protected boolean interactive;
    transient PrintStream out;
    Interpreter parent;
    transient Parser parser;
    private boolean showResults;
    String sourceFileInfo;
    private boolean strictJava;

    static {
        staticInit();
    }

    public Interpreter() {
        this(new StringReader(""), System.out, System.err, false, null);
        this.evalOnly = true;
        setu("bsh.evalOnly", new Primitive(true));
    }

    public Interpreter(ConsoleInterface consoleInterface) {
        this(consoleInterface, null);
    }

    public Interpreter(ConsoleInterface consoleInterface, NameSpace nameSpace) {
        this(consoleInterface.getIn(), consoleInterface.getOut(), consoleInterface.getErr(), true, nameSpace);
        setConsole(consoleInterface);
    }

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z) {
        this(reader, printStream, printStream2, z, null);
    }

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z, NameSpace nameSpace) {
        this(reader, printStream, printStream2, z, nameSpace, null, null);
    }

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z, NameSpace nameSpace, Interpreter interpreter, String str) {
        this.strictJava = false;
        this.exitOnEOF = true;
        this.parser = new Parser(reader);
        long currentTimeMillis = System.currentTimeMillis();
        this.f2118in = reader;
        this.out = printStream;
        this.err = printStream2;
        this.interactive = z;
        debug = printStream2;
        this.parent = interpreter;
        if (interpreter != null) {
            setStrictJava(interpreter.getStrictJava());
        }
        this.sourceFileInfo = str;
        BshClassManager createClassManager = BshClassManager.createClassManager(this);
        if (nameSpace == null) {
            this.globalNameSpace = new NameSpace(createClassManager, "global");
        } else {
            this.globalNameSpace = nameSpace;
        }
        if (!(getu("bsh") instanceof This)) {
            initRootSystemObject();
        }
        if (z) {
            loadRCFiles();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Time to initialize interpreter: ");
            stringBuffer.append(currentTimeMillis2 - currentTimeMillis);
            debug(stringBuffer.toString());
        }
    }

    private boolean Line() {
        return this.parser.Line();
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static final void debug(String str) {
        if (DEBUG) {
            PrintStream printStream = debug;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("// Debug: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    private String getBshPrompt() {
        try {
            return (String) eval("getBshPrompt()");
        } catch (Exception unused) {
            return "bsh % ";
        }
    }

    private JavaCharStream get_jj_input_stream() {
        return this.parser.jj_input_stream;
    }

    private JJTParserState get_jjtree() {
        return this.parser.jjtree;
    }

    private void initRootSystemObject() {
        BshClassManager classManager = getClassManager();
        setu("bsh", new NameSpace(classManager, "Bsh Object").getThis(this));
        if (sharedObject == null) {
            sharedObject = new NameSpace(classManager, "Bsh Shared System Object").getThis(this);
        }
        setu("bsh.system", sharedObject);
        setu("bsh.shared", sharedObject);
        setu("bsh.help", new NameSpace(classManager, "Bsh Command Help Text").getThis(this));
        try {
            setu("bsh.cwd", System.getProperty("user.dir"));
        } catch (SecurityException unused) {
            setu("bsh.cwd", ".");
        }
        setu("bsh.interactive", new Primitive(this.interactive));
        setu("bsh.evalOnly", new Primitive(this.evalOnly));
    }

    public static void invokeMain(Class cls, String[] strArr) {
        Class[] clsArr = new Class[1];
        Class cls2 = array$Ljava$lang$String;
        if (cls2 == null) {
            cls2 = class$("[Ljava.lang.String;");
            array$Ljava$lang$String = cls2;
        }
        clsArr[0] = cls2;
        Method resolveJavaMethod = Reflect.resolveJavaMethod(null, cls, "main", clsArr, true);
        if (resolveJavaMethod != null) {
            resolveJavaMethod.invoke(null, strArr);
        }
    }

    public static void main(String[] strArr) {
        String[] strArr2;
        Object e;
        String str;
        StringBuffer stringBuffer;
        PrintStream printStream;
        if (strArr.length > 0) {
            String str2 = strArr[0];
            if (strArr.length > 1) {
                strArr2 = new String[(strArr.length - 1)];
                System.arraycopy(strArr, 1, strArr2, 0, strArr.length - 1);
            } else {
                strArr2 = new String[0];
            }
            Interpreter interpreter = new Interpreter();
            interpreter.setu("bsh.args", strArr2);
            try {
                Object source = interpreter.source(str2, interpreter.globalNameSpace);
                if (source instanceof Class) {
                    try {
                        invokeMain((Class) source, strArr2);
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof InvocationTargetException) {
                            e = ((InvocationTargetException) e).getTargetException();
                        }
                        PrintStream printStream2 = System.err;
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Class: ");
                        stringBuffer2.append(source);
                        stringBuffer2.append(" main method threw exception:");
                        stringBuffer2.append(e);
                        printStream2.println(stringBuffer2.toString());
                    }
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                printStream = System.out;
                stringBuffer = new StringBuffer();
                str = "File not found: ";
                stringBuffer.append(str);
                stringBuffer.append(e);
                printStream.println(stringBuffer.toString());
            } catch (TargetError e4) {
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Script threw exception: ");
                stringBuffer3.append(e4);
                printStream3.println(stringBuffer3.toString());
                if (e4.inNativeCode()) {
                    e4.printStackTrace(DEBUG, System.err);
                }
            } catch (EvalError e5) {
                e = e5;
                printStream = System.out;
                stringBuffer = new StringBuffer();
                str = "Evaluation Error: ";
                stringBuffer.append(str);
                stringBuffer.append(e);
                printStream.println(stringBuffer.toString());
            } catch (IOException e6) {
                e = e6;
                printStream = System.out;
                stringBuffer = new StringBuffer();
                str = "I/O Error: ";
                stringBuffer.append(str);
                stringBuffer.append(e);
                printStream.println(stringBuffer.toString());
            }
        } else {
            new Interpreter(new CommandLineReader(new InputStreamReader((!System.getProperty("os.name").startsWith("Windows") || !System.getProperty("java.version").startsWith("1.1.")) ? System.in : new FilterInputStream(System.in) {
                /* class bsh.Interpreter.C09731 */

                @Override // java.io.FilterInputStream, java.io.InputStream
                public int available() {
                    return 0;
                }
            })), System.out, System.err, true).run();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        PrintStream printStream;
        objectInputStream.defaultReadObject();
        ConsoleInterface consoleInterface = this.console;
        if (consoleInterface != null) {
            setOut(consoleInterface.getOut());
            printStream = this.console.getErr();
        } else {
            setOut(System.out);
            printStream = System.err;
        }
        setErr(printStream);
    }

    public static void redirectOutputToFile(String str) {
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream(str));
            System.setOut(printStream);
            System.setErr(printStream);
        } catch (IOException unused) {
            PrintStream printStream2 = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't redirect output to file: ");
            stringBuffer.append(str);
            printStream2.println(stringBuffer.toString());
        }
    }

    private String showEvalString(String str) {
        String replace = str.replace('\n', ' ').replace('\r', ' ');
        if (replace.length() <= 80) {
            return replace;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(replace.substring(0, 80));
        stringBuffer.append(" . . . ");
        return stringBuffer.toString();
    }

    static void staticInit() {
        String str;
        StringBuffer stringBuffer;
        PrintStream printStream;
        Object th;
        try {
            systemLineSeparator = System.getProperty("line.separator");
            debug = System.err;
            DEBUG = Boolean.getBoolean("debug");
            TRACE = Boolean.getBoolean("trace");
            LOCALSCOPING = Boolean.getBoolean("localscoping");
            String property = System.getProperty("outfile");
            if (property != null) {
                redirectOutputToFile(property);
            }
        } catch (SecurityException e) {
            th = e;
            printStream = System.err;
            stringBuffer = new StringBuffer();
            str = "Could not init static:";
            stringBuffer.append(str);
            stringBuffer.append(th);
            printStream.println(stringBuffer.toString());
        } catch (Exception e2) {
            th = e2;
            printStream = System.err;
            stringBuffer = new StringBuffer();
            str = "Could not init static(2):";
            stringBuffer.append(str);
            stringBuffer.append(th);
            printStream.println(stringBuffer.toString());
        } catch (Throwable th2) {
            th = th2;
            printStream = System.err;
            stringBuffer = new StringBuffer();
            str = "Could not init static(3):";
            stringBuffer.append(str);
            stringBuffer.append(th);
            printStream.println(stringBuffer.toString());
        }
    }

    @Override // bsh.ConsoleInterface
    public final void error(Object obj) {
        ConsoleInterface consoleInterface = this.console;
        if (consoleInterface != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("// Error: ");
            stringBuffer.append(obj);
            stringBuffer.append("\n");
            consoleInterface.error(stringBuffer.toString());
            return;
        }
        PrintStream printStream = this.err;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("// Error: ");
        stringBuffer2.append(obj);
        printStream.println(stringBuffer2.toString());
        this.err.flush();
    }

    public Object eval(Reader reader) {
        return eval(reader, this.globalNameSpace, "eval stream");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d3, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d4, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011e, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0148, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
        r7.setNode(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        r7.setNode(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c7, code lost:
        r2 = bsh.Interpreter.DEBUG;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c9, code lost:
        if (r2 != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cb, code lost:
        error(r0.getMessage(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d2, code lost:
        r0.setErrorSourceFile(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d5, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011e A[Catch:{ ParseException -> 0x01c6, InterpreterError -> 0x01a1, TargetError -> 0x0175, EvalError -> 0x0142, Exception -> 0x0119, TokenMgrError -> 0x00f7, all -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0148 A[Catch:{ ParseException -> 0x01c6, InterpreterError -> 0x01a1, TargetError -> 0x0175, EvalError -> 0x0142, Exception -> 0x0119, TokenMgrError -> 0x00f7, all -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0151 A[Catch:{ ParseException -> 0x01c6, InterpreterError -> 0x01a1, TargetError -> 0x0175, EvalError -> 0x0142, Exception -> 0x0119, TokenMgrError -> 0x00f7, all -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c6 A[ExcHandler: ParseException (r0v1 'e' bsh.ParseException A[CUSTOM_DECLARE]), Splitter:B:6:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0031 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0031 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object eval(java.io.Reader r11, bsh.NameSpace r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 492
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Interpreter.eval(java.io.Reader, bsh.NameSpace, java.lang.String):java.lang.Object");
    }

    public Object eval(String str) {
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("eval(String): ");
            stringBuffer.append(str);
            debug(stringBuffer.toString());
        }
        return eval(str, this.globalNameSpace);
    }

    public Object eval(String str, NameSpace nameSpace) {
        if (!str.endsWith(";")) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(";");
            str = stringBuffer.toString();
        }
        StringReader stringReader = new StringReader(str);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("inline evaluation of: ``");
        stringBuffer2.append(showEvalString(str));
        stringBuffer2.append("''");
        return eval(stringReader, nameSpace, stringBuffer2.toString());
    }

    public Object get(String str) {
        try {
            return Primitive.unwrap(this.globalNameSpace.get(str, this));
        } catch (UtilEvalError e) {
            throw e.toEvalError(SimpleNode.JAVACODE, new CallStack());
        }
    }

    public BshClassManager getClassManager() {
        return getNameSpace().getClassManager();
    }

    @Override // bsh.ConsoleInterface
    public PrintStream getErr() {
        return this.err;
    }

    @Override // bsh.ConsoleInterface
    public Reader getIn() {
        return this.f2118in;
    }

    public Object getInterface(Class cls) {
        try {
            return this.globalNameSpace.getThis(this).getInterface(cls);
        } catch (UtilEvalError e) {
            throw e.toEvalError(SimpleNode.JAVACODE, new CallStack());
        }
    }

    public NameSpace getNameSpace() {
        return this.globalNameSpace;
    }

    @Override // bsh.ConsoleInterface
    public PrintStream getOut() {
        return this.out;
    }

    public Interpreter getParent() {
        return this.parent;
    }

    public boolean getShowResults() {
        return this.showResults;
    }

    public String getSourceFileInfo() {
        String str = this.sourceFileInfo;
        return str != null ? str : "<unknown source>";
    }

    public boolean getStrictJava() {
        return this.strictJava;
    }

    /* access modifiers changed from: package-private */
    public Object getu(String str) {
        try {
            return get(str);
        } catch (EvalError e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("set: ");
            stringBuffer.append(e);
            throw new InterpreterError(stringBuffer.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public void loadRCFiles() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(System.getProperty("user.home"));
            stringBuffer.append(File.separator);
            stringBuffer.append(".bshrc");
            source(stringBuffer.toString(), this.globalNameSpace);
        } catch (Exception e) {
            if (DEBUG) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Could not find rc file: ");
                stringBuffer2.append(e);
                debug(stringBuffer2.toString());
            }
        }
    }

    public File pathToFile(String str) {
        File file = new File(str);
        if (!file.isAbsolute()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append((String) getu("bsh.cwd"));
            stringBuffer.append(File.separator);
            stringBuffer.append(str);
            file = new File(stringBuffer.toString());
        }
        return new File(file.getCanonicalPath());
    }

    @Override // bsh.ConsoleInterface
    public final void print(Object obj) {
        ConsoleInterface consoleInterface = this.console;
        if (consoleInterface != null) {
            consoleInterface.print(obj);
            return;
        }
        this.out.print(obj);
        this.out.flush();
    }

    @Override // bsh.ConsoleInterface
    public final void println(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(obj));
        stringBuffer.append(systemLineSeparator);
        print(stringBuffer.toString());
    }

    public void run() {
        String stringBuffer;
        if (!this.evalOnly) {
            if (this.interactive) {
                try {
                    eval("printBanner();");
                } catch (EvalError unused) {
                    println("BeanShell 2.0b4 - by Pat Niemeyer (pat@pat.net)");
                }
            }
            CallStack callStack = new CallStack(this.globalNameSpace);
            boolean z = false;
            while (!z) {
                try {
                    System.out.flush();
                    System.err.flush();
                    Thread.yield();
                    if (this.interactive) {
                        print(getBshPrompt());
                    }
                    z = Line();
                    if (get_jjtree().nodeArity() > 0) {
                        SimpleNode simpleNode = (SimpleNode) get_jjtree().rootNode();
                        if (DEBUG) {
                            simpleNode.dump(">");
                        }
                        Object eval = simpleNode.eval(callStack, this);
                        if (callStack.depth() <= 1) {
                            if (eval instanceof ReturnControl) {
                                eval = ((ReturnControl) eval).value;
                            }
                            if (eval != Primitive.VOID) {
                                setu("$_", eval);
                                if (this.showResults) {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append("<");
                                    stringBuffer2.append(eval);
                                    stringBuffer2.append(">");
                                    println(stringBuffer2.toString());
                                }
                            }
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("Callstack growing: ");
                            stringBuffer3.append(callStack);
                            throw new InterpreterError(stringBuffer3.toString());
                        }
                    }
                    get_jjtree().reset();
                    if (callStack.depth() <= 1) {
                    }
                } catch (ParseException e) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Parser Error: ");
                    stringBuffer4.append(e.getMessage(DEBUG));
                    error(stringBuffer4.toString());
                    if (DEBUG) {
                        e.printStackTrace();
                    }
                    if (!this.interactive) {
                        z = true;
                    }
                    this.parser.reInitInput(this.f2118in);
                    get_jjtree().reset();
                    if (callStack.depth() <= 1) {
                    }
                } catch (InterpreterError e2) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("Internal Error: ");
                    stringBuffer5.append(e2.getMessage());
                    error(stringBuffer5.toString());
                    e2.printStackTrace();
                    if (!this.interactive) {
                        z = true;
                    }
                    get_jjtree().reset();
                    if (callStack.depth() <= 1) {
                    }
                } catch (TargetError e3) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("// Uncaught Exception: ");
                    stringBuffer6.append(e3);
                    error(stringBuffer6.toString());
                    if (e3.inNativeCode()) {
                        e3.printStackTrace(DEBUG, this.err);
                    }
                    if (!this.interactive) {
                        z = true;
                    }
                    setu("$_e", e3.getTarget());
                    get_jjtree().reset();
                    if (callStack.depth() <= 1) {
                    }
                } catch (EvalError e4) {
                    if (this.interactive) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("EvalError: ");
                        stringBuffer7.append(e4.toString());
                        stringBuffer = stringBuffer7.toString();
                    } else {
                        StringBuffer stringBuffer8 = new StringBuffer();
                        stringBuffer8.append("EvalError: ");
                        stringBuffer8.append(e4.getMessage());
                        stringBuffer = stringBuffer8.toString();
                    }
                    error(stringBuffer);
                    if (DEBUG) {
                        e4.printStackTrace();
                    }
                    if (!this.interactive) {
                        z = true;
                    }
                    get_jjtree().reset();
                    if (callStack.depth() <= 1) {
                    }
                } catch (Exception e5) {
                    StringBuffer stringBuffer9 = new StringBuffer();
                    stringBuffer9.append("Unknown error: ");
                    stringBuffer9.append(e5);
                    error(stringBuffer9.toString());
                    if (DEBUG) {
                        e5.printStackTrace();
                    }
                    if (!this.interactive) {
                        z = true;
                    }
                    get_jjtree().reset();
                    if (callStack.depth() <= 1) {
                    }
                } catch (TokenMgrError e6) {
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append("Error parsing input: ");
                    stringBuffer10.append(e6);
                    error(stringBuffer10.toString());
                    this.parser.reInitTokenInput(this.f2118in);
                    if (!this.interactive) {
                        z = true;
                    }
                    get_jjtree().reset();
                    if (callStack.depth() <= 1) {
                    }
                } catch (Throwable th) {
                    get_jjtree().reset();
                    if (callStack.depth() > 1) {
                        callStack.clear();
                        callStack.push(this.globalNameSpace);
                    }
                    throw th;
                }
                callStack.clear();
                callStack.push(this.globalNameSpace);
            }
            if (this.interactive && this.exitOnEOF) {
                System.exit(0);
                return;
            }
            return;
        }
        throw new RuntimeException("bsh Interpreter: No stream");
    }

    public void set(String str, double d) {
        set(str, new Primitive(d));
    }

    public void set(String str, float f) {
        set(str, new Primitive(f));
    }

    public void set(String str, int i) {
        set(str, new Primitive(i));
    }

    public void set(String str, long j) {
        set(str, new Primitive(j));
    }

    public void set(String str, Object obj) {
        if (obj == null) {
            obj = Primitive.NULL;
        }
        CallStack callStack = new CallStack();
        try {
            if (Name.isCompound(str)) {
                this.globalNameSpace.getNameResolver(str).toLHS(callStack, this).assign(obj, false);
            } else {
                this.globalNameSpace.setVariable(str, obj, false);
            }
        } catch (UtilEvalError e) {
            throw e.toEvalError(SimpleNode.JAVACODE, callStack);
        }
    }

    public void set(String str, boolean z) {
        set(str, new Primitive(z));
    }

    public void setClassLoader(ClassLoader classLoader) {
        getClassManager().setClassLoader(classLoader);
    }

    public void setConsole(ConsoleInterface consoleInterface) {
        this.console = consoleInterface;
        setu("bsh.console", consoleInterface);
        setOut(consoleInterface.getOut());
        setErr(consoleInterface.getErr());
    }

    public void setErr(PrintStream printStream) {
        this.err = printStream;
    }

    public void setExitOnEOF(boolean z) {
        this.exitOnEOF = z;
    }

    public void setNameSpace(NameSpace nameSpace) {
        this.globalNameSpace = nameSpace;
    }

    public void setOut(PrintStream printStream) {
        this.out = printStream;
    }

    public void setShowResults(boolean z) {
        this.showResults = z;
    }

    public void setStrictJava(boolean z) {
        this.strictJava = z;
    }

    /* access modifiers changed from: package-private */
    public void setu(String str, Object obj) {
        try {
            set(str, obj);
        } catch (EvalError e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("set: ");
            stringBuffer.append(e);
            throw new InterpreterError(stringBuffer.toString());
        }
    }

    public Object source(String str) {
        return source(str, this.globalNameSpace);
    }

    public Object source(String str, NameSpace nameSpace) {
        File pathToFile = pathToFile(str);
        if (DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Sourcing file: ");
            stringBuffer.append(pathToFile);
            debug(stringBuffer.toString());
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile));
        try {
            return eval(bufferedReader, nameSpace, str);
        } finally {
            bufferedReader.close();
        }
    }

    public void unset(String str) {
        try {
            LHS lhs = this.globalNameSpace.getNameResolver(str).toLHS(new CallStack(), this);
            if (lhs.type == 0) {
                lhs.nameSpace.unsetVariable(str);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't unset, not a variable: ");
            stringBuffer.append(str);
            throw new EvalError(stringBuffer.toString(), SimpleNode.JAVACODE, new CallStack());
        } catch (UtilEvalError e) {
            throw new EvalError(e.getMessage(), SimpleNode.JAVACODE, new CallStack());
        }
    }
}
