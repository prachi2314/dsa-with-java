import java.util.HashSet;
import  java.util.Iterator;

public class Hasing {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // Searching
        if(set.contains(1)){
            System.out.println("true");
        }

        if (!set.contains(5)) {
            System.out.println("false");
        }

        // Size
        System.out.println(set.size());

        // print all element
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
