package jvm;

import com.sun.istack.internal.Nullable;
import instruction.JInstruction;
import jvalue.JValue;
import jclass.JMethod;

import java.util.Stack;

public class StackFrame {
    private Stack<JValue> operands;
    private JValue[] locals;
    private int pc;
    private JMethod method;

    public StackFrame(Stack<JValue> operands, JValue[] locals, int pc, JMethod method) {
        this.operands = operands;
        this.locals = locals;
        this.pc = pc;
        this.method = method;
    }

    @Nullable
    public JInstruction nextInstruction() {
        return method.nextInstruction();
    }

    public Stack<JValue> getOperands() {
        return this.operands;
    }
}
