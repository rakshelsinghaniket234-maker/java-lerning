import java.util.PriorityQueue;
import java.util.Collections;

public class PQDemoMax {
    public static void main(String[] args) {

        // Max Heap (reverse order)
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        pq.add(50);
        System.out.println(pq);

        pq.add(10);
        System.out.println(pq);

        pq.add(30);
        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println("Deleted Element: " + pq.poll());
        }
    }
}