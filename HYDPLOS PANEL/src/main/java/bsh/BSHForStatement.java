package bsh;

class BSHForStatement extends SimpleNode implements ParserConstants {
    private SimpleNode expression;
    private SimpleNode forInit;
    private SimpleNode forUpdate;
    public boolean hasExpression;
    public boolean hasForInit;
    public boolean hasForUpdate;
    private boolean parsed;
    private SimpleNode statement;

    BSHForStatement(int i) {
        super(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081 A[EDGE_INSN: B:40:0x0081->B:33:0x0081 ?: BREAK  , SYNTHETIC] */
    @Override // bsh.SimpleNode
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object eval(bsh.CallStack r8, bsh.Interpreter r9) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHForStatement.eval(bsh.CallStack, bsh.Interpreter):java.lang.Object");
    }
}
