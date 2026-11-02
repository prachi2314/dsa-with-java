import java.util.*;;

public class MinHeap {

    ArrayList<Integer> hp = new ArrayList<>();
     public void insert(int value){
        hp.add(value);

        int i = hp.size()-1;

        while (i>0) {
            int parent = (i-1)/2;
            if(hp.get(i) < hp.get(parent)){
                int temp = hp.get(i);
                hp.set(i, hp.get(parent));
                hp.set(parent, temp);
                i = parent;
            }else{
                break;
            }
        }
        
    }

    public static void main(String[] args) {
        MinHeap mh = new MinHeap();

    mh.insert(10);
    mh.insert(5);
    mh.insert(20);
    mh.insert(31);
    mh.insert(28);
        
    System.out.println(mh.hp);
    }
}
