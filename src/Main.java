import instruction.IAdd;
import instruction.JInstruction;
import jclass.JMethod;
import jvalue.JInteger;
import jvalue.JValue;
import jvm.ClassArea;
import jvm.Heap;
import jvm.JVM;
import jvm.StackFrame;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("JVM executing ...");

        Heap heap = new Heap();

        /**
         * StackFrame
         * */
        Stack<JValue> operands = new Stack<>();
        operands.push(new JInteger(1));
        operands.push(new JInteger(2));
        operands.push(new JInteger(3));
        operands.push(new JInteger(4));
        JValue[] locals = new JValue[]{new JInteger(0)};

        JInstruction[] instructions = new JInstruction[]{new IAdd(), new IAdd(), new IAdd()};

        JMethod method = new JMethod(1, instructions, 0);

        StackFrame frame = new StackFrame(operands, locals, 0, method);

        /**
         * ClassArea
         * */
        ClassArea classArea = new ClassArea();

        JVM jvm = new JVM(frame, heap, classArea);

        jvm.run();

        System.out.println("JVM exiting ...");
    }
}
