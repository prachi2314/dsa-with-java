import java.util.LinkedList;

public class ListLinked {
    public static void main(String[] args) {
        LinkedList<Integer> lt = new LinkedList<>();

        lt.add(10);
        lt.add(20);
        lt.add(30);
        lt.add(40);

        lt.addFirst(5);
        lt.addLast(25);
        lt.removeFirst();
        lt.removeLast();
        System.out.println(lt);
        System.out.println(lt.size());
    }
}
