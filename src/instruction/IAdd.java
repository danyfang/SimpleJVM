package instruction;


import jvalue.JInteger;
import jvm.JVM;
import jvalue.JValue;

import java.util.Stack;

public class IAdd extends JInstruction {
    public IAdd(String label) {
        super(label);
    }

    public IAdd() {
        this(null);
    }

    @Override
    public void execute(JVM context) {
        Stack<JValue> stack = context.getTopFrame().getOperands();

        if (stack.size() < 2) {
            System.out.println("not enough operands on stack");
            System.exit(1);
        }

        JValue val1 = stack.pop();
        JValue val2 = stack.pop();


        if ((!(val1 instanceof JInteger) ||
                !(val2 instanceof JInteger))) {
            System.out.println("instruction.IAdd can't add non integers");
            System.exit(1);
        }

        JInteger int1 = (JInteger)val1;
        JInteger int2 = (JInteger)val2;

        JInteger result = int1.add(int2);

        stack.push(result);
    }
}
