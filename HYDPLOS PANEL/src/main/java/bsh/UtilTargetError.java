package bsh;

public class UtilTargetError extends UtilEvalError {

    /* renamed from: t */
    public Throwable f2130t;

    public UtilTargetError(String str, Throwable th) {
        super(str);
        this.f2130t = th;
    }

    public UtilTargetError(Throwable th) {
        this(null, th);
    }

    @Override // bsh.UtilEvalError
    public EvalError toEvalError(String str, SimpleNode simpleNode, CallStack callStack) {
        String str2;
        if (str == null) {
            str2 = getMessage();
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(getMessage());
            str2 = stringBuffer.toString();
        }
        return new TargetError(str2, this.f2130t, simpleNode, callStack, false);
    }
}
