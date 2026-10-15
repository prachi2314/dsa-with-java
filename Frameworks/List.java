import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(10);
        lt.add(20);
        lt.add(30);
        lt.add(40);

        lt.add(1,15);
        lt.set(3, 25);
        lt.remove(0);

        System.out.println(lt);
        System.out.println(lt.size());
    }
}
