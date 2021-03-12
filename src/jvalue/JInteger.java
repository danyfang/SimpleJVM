package jvalue;

public class JInteger implements JValue {
    private int value;

    public JInteger(int val) {
        this.value = val;
    }

    public JInteger add(JInteger val) {
        return new JInteger(value + val.value);
    }

    public JInteger mul(JInteger val) {
        return new JInteger(value * val.value);

    }

    public JInteger sub(JInteger val) {
        return new JInteger(value - val.value);
    }

    public JInteger div(JInteger val) {
        if (val.value == 0) {
            System.out.println("Val cannot be 0");
            System.exit(-1);
        }
        return new JInteger(value / val.value);
    }

    public JInteger rem(JInteger val) {
        return new JInteger(value % val.value);
    }
}
