import java.util.Queue;
import java.util.LinkedList;

class Queue_List{
    public static void main(String[] args) {
        Queue<Integer> qt = new LinkedList<>();

        qt.offer(10);
        qt.offer(15);
        qt.offer(25);
        qt.offer(35);
        System.out.println(qt.peek());
        qt.poll();
        System.out.println(qt.peek());
        System.out.println(qt);
    }
}