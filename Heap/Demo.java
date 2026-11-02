import java.util.*;

public class Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(31);
        pq.add(28);

        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.peek());
        System.out.println(pq.size());
    }
    
    
}
