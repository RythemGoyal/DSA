public class StackMain {
    public static void main(String[] args) throws Exception {
        Stacks stack = new Stacks();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.print(stack.pop());
    }
}
