package jvm;

import instruction.JInstruction;

public class JVM {
    private StackFrame topFrame;
    private Heap heap;
    private ClassArea classes;

    public JVM(StackFrame topFrame, Heap heap, ClassArea classes) {
        this.topFrame = topFrame;
        this.heap = heap;
        this.classes = classes;
    }


    public void run() {
        while(topFrame != null) {
            JInstruction next = topFrame.nextInstruction();
            next.execute(this);
        }
    }

    public StackFrame getTopFrame() {
        return topFrame;
    }

    public Heap getHeap() {
        return heap;
    }

    public ClassArea getClassArea() {
        return classes;
    }
}
