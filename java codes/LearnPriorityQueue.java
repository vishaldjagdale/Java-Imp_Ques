import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(0);
        pq.offer(2);
        pq.offer(4);
        pq.offer(1);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
