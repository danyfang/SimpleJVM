package instruction;

import jvm.JVM;

public abstract class JInstruction {
    private String label;

    public JInstruction(String label) {
        this.label = label;
    }

    public abstract void execute(JVM context);
}
