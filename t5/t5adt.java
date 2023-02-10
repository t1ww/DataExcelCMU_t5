package t5;

public class t5adt {
    public static void main(String[] args) {
        Stack stk = new Stack(10);
        stk.peek();
        stk.push(new task("123456", "do something"));
        stk.peek();
        stk.pop();
        stk.peek();
    }
}