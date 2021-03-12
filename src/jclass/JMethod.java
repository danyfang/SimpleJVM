package jclass;

import instruction.JInstruction;

public class JMethod {
    private int numLocals;
    private JInstruction[] instructions;
    int index;

    public JMethod(int numLocals, JInstruction[] instructions, int index) {
        this.numLocals = numLocals;
        this.instructions = instructions;
        this.index = index;
    }

    public JInstruction nextInstruction() {
        if (index < instructions.length) {
            return instructions[index++];
        }
        return null;
    }

}
