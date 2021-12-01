package bsh;

import java.util.Stack;

/* access modifiers changed from: package-private */
public class JJTParserState {
    private Stack marks = new Stack();

    /* renamed from: mk */
    private int f2119mk = 0;
    private boolean node_created;
    private Stack nodes = new Stack();

    /* renamed from: sp */
    private int f2120sp = 0;

    JJTParserState() {
    }

    /* access modifiers changed from: package-private */
    public void clearNodeScope(Node node) {
        while (this.f2120sp > this.f2119mk) {
            popNode();
        }
        this.f2119mk = ((Integer) this.marks.pop()).intValue();
    }

    /* access modifiers changed from: package-private */
    public void closeNodeScope(Node node, int i) {
        this.f2119mk = ((Integer) this.marks.pop()).intValue();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                node.jjtClose();
                pushNode(node);
                this.node_created = true;
                return;
            }
            Node popNode = popNode();
            popNode.jjtSetParent(node);
            node.jjtAddChild(popNode, i2);
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void closeNodeScope(Node node, boolean z) {
        boolean z2;
        if (z) {
            int nodeArity = nodeArity();
            this.f2119mk = ((Integer) this.marks.pop()).intValue();
            while (true) {
                int i = nodeArity - 1;
                if (nodeArity <= 0) {
                    break;
                }
                Node popNode = popNode();
                popNode.jjtSetParent(node);
                node.jjtAddChild(popNode, i);
                nodeArity = i;
            }
            node.jjtClose();
            pushNode(node);
            z2 = true;
        } else {
            this.f2119mk = ((Integer) this.marks.pop()).intValue();
            z2 = false;
        }
        this.node_created = z2;
    }

    /* access modifiers changed from: package-private */
    public int nodeArity() {
        return this.f2120sp - this.f2119mk;
    }

    /* access modifiers changed from: package-private */
    public boolean nodeCreated() {
        return this.node_created;
    }

    /* access modifiers changed from: package-private */
    public void openNodeScope(Node node) {
        this.marks.push(new Integer(this.f2119mk));
        this.f2119mk = this.f2120sp;
        node.jjtOpen();
    }

    /* access modifiers changed from: package-private */
    public Node peekNode() {
        return (Node) this.nodes.peek();
    }

    /* access modifiers changed from: package-private */
    public Node popNode() {
        int i = this.f2120sp - 1;
        this.f2120sp = i;
        if (i < this.f2119mk) {
            this.f2119mk = ((Integer) this.marks.pop()).intValue();
        }
        return (Node) this.nodes.pop();
    }

    /* access modifiers changed from: package-private */
    public void pushNode(Node node) {
        this.nodes.push(node);
        this.f2120sp++;
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.nodes.removeAllElements();
        this.marks.removeAllElements();
        this.f2120sp = 0;
        this.f2119mk = 0;
    }

    /* access modifiers changed from: package-private */
    public Node rootNode() {
        return (Node) this.nodes.elementAt(0);
    }
}
