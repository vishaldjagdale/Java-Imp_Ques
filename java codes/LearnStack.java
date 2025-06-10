import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
    }
    
}
