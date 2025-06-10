import java.util.*;
public class StackUsingQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public StackUsingQueue() {
        // Constructor — no initialization needed
    }

    // Add element to the end of the queue
    public void push(int x) {
        input.push(x);
    }

    // Remove the element from the front of the queue
    public int pop() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    // Get the front element
    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    // Return the size of the queue
    public int size() {
        return input.size() + output.size();
    }

    // Return whether the queue is empty
    public boolean empty() {
        return input.empty() && output.empty();
    }
    public static void main(String[] args) {
        StackUsingQueue queue = new StackUsingQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop()); // 1
        System.out.println(queue.peek()); // 2
        System.out.println(queue.size()); // 2
        System.out.println(queue.empty()); // false
    }
}


