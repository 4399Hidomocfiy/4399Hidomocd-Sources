package bsh;

class BSHBlock extends SimpleNode {
    public boolean isSynchronized = false;

    public interface NodeFilter {
        boolean isVisible(SimpleNode simpleNode);
    }

    BSHBlock(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return eval(callStack, interpreter, false);
    }

    public Object eval(CallStack callStack, Interpreter interpreter, boolean z) {
        Object evalBlock;
        Object eval = this.isSynchronized ? ((SimpleNode) jjtGetChild(0)).eval(callStack, interpreter) : null;
        if (!this.isSynchronized) {
            return evalBlock(callStack, interpreter, z, null);
        }
        synchronized (eval) {
            evalBlock = evalBlock(callStack, interpreter, z, null);
        }
        return evalBlock;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x001b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object evalBlock(bsh.CallStack r8, bsh.Interpreter r9, boolean r10, bsh.BSHBlock.NodeFilter r11) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHBlock.evalBlock(bsh.CallStack, bsh.Interpreter, boolean, bsh.BSHBlock$NodeFilter):java.lang.Object");
    }
}
