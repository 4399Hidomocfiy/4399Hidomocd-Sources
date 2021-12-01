package bsh;

import java.lang.reflect.InvocationTargetException;

class BSHMethodInvocation extends SimpleNode {
    BSHMethodInvocation(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode
    public Object eval(CallStack callStack, Interpreter interpreter) {
        NameSpace pVar = callStack.top();
        BSHAmbiguousName nameNode = getNameNode();
        if (pVar.getParent() != null && pVar.getParent().isClass && (nameNode.text.equals("super") || nameNode.text.equals("this"))) {
            return Primitive.VOID;
        }
        Name name = nameNode.getName(pVar);
        try {
            return name.invokeMethod(interpreter, getArgsNode().getArguments(callStack, interpreter), callStack, this);
        } catch (ReflectError e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Error in method invocation: ");
            stringBuffer.append(e.getMessage());
            throw new EvalError(stringBuffer.toString(), this, callStack);
        } catch (InvocationTargetException e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Method Invocation ");
            stringBuffer2.append(name);
            String stringBuffer3 = stringBuffer2.toString();
            Throwable targetException = e2.getTargetException();
            throw new TargetError(stringBuffer3, targetException, this, callStack, targetException instanceof EvalError ? targetException instanceof TargetError ? ((TargetError) targetException).inNativeCode() : false : true);
        } catch (UtilEvalError e3) {
            throw e3.toEvalError(this, callStack);
        }
    }

    /* access modifiers changed from: package-private */
    public BSHArguments getArgsNode() {
        return (BSHArguments) jjtGetChild(1);
    }

    /* access modifiers changed from: package-private */
    public BSHAmbiguousName getNameNode() {
        return (BSHAmbiguousName) jjtGetChild(0);
    }
}
