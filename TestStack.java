public class TestStack {
    public static void main(String[] args){
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(-3);
        stack.push(5);
        stack.push(-3);
        stack.push(12);
        stack.push(-3);
        stack.push(5);
        stack.push(-8);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
