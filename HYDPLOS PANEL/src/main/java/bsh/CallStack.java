package bsh;

import java.util.Vector;

public class CallStack {
    private Vector stack = new Vector(2);

    public CallStack() {
    }

    public CallStack(NameSpace nameSpace) {
        push(nameSpace);
    }

    public void clear() {
        this.stack.removeAllElements();
    }

    public CallStack copy() {
        CallStack callStack = new CallStack();
        callStack.stack = (Vector) this.stack.clone();
        return callStack;
    }

    public int depth() {
        return this.stack.size();
    }

    public NameSpace get(int i) {
        return i >= depth() ? NameSpace.JAVACODE : (NameSpace) this.stack.elementAt(i);
    }

    public NameSpace pop() {
        if (depth() >= 1) {
            NameSpace pVar = top();
            this.stack.removeElementAt(0);
            return pVar;
        }
        throw new InterpreterError("pop on empty CallStack");
    }

    public void push(NameSpace nameSpace) {
        this.stack.insertElementAt(nameSpace, 0);
    }

    public void set(int i, NameSpace nameSpace) {
        this.stack.setElementAt(nameSpace, i);
    }

    public NameSpace swap(NameSpace nameSpace) {
        NameSpace nameSpace2 = (NameSpace) this.stack.elementAt(0);
        this.stack.setElementAt(nameSpace, 0);
        return nameSpace2;
    }

    public NameSpace[] toArray() {
        NameSpace[] nameSpaceArr = new NameSpace[depth()];
        this.stack.copyInto(nameSpaceArr);
        return nameSpaceArr;
    }

    public String toString() {
        NameSpace[] array;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CallStack:\n");
        for (NameSpace nameSpace : toArray()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("\t");
            stringBuffer2.append(nameSpace);
            stringBuffer2.append("\n");
            stringBuffer.append(stringBuffer2.toString());
        }
        return stringBuffer.toString();
    }

    public NameSpace top() {
        return get(0);
    }
}
