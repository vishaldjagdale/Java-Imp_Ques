import java.util.ArrayDeque;
import java.util.Deque;
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offerFirst(4);
        deque.offerLast(5);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
}
