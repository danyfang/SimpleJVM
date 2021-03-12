public class Example {
    private int answer;
    public Example(int ans) {
        answer = ans;
    }
    public void increase() {
        answer += 1;
    }

    public void print() {
        System.out.println(answer);
    }
}
