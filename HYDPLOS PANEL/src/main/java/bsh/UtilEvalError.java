package bsh;

public class UtilEvalError extends Exception {
    protected UtilEvalError() {
    }

    public UtilEvalError(String str) {
        super(str);
    }

    public EvalError toEvalError(SimpleNode simpleNode, CallStack callStack) {
        return toEvalError(null, simpleNode, callStack);
    }

    public EvalError toEvalError(String str, SimpleNode simpleNode, CallStack callStack) {
        String str2;
        if (Interpreter.DEBUG) {
            printStackTrace();
        }
        if (str == null) {
            str2 = "";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(": ");
            str2 = stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str2);
        stringBuffer2.append(getMessage());
        return new EvalError(stringBuffer2.toString(), simpleNode, callStack);
    }
}
