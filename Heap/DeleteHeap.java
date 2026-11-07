import java.util.*;

public class DeleteHeap {

    ArrayList<Integer> hp = new ArrayList<>();
    public static void main(String[] args) {
        DeleteHeap heap = new DeleteHeap();
        heap.hp.add(5);
        heap.hp.add(25);
        heap.hp.add(19);
        heap.hp.add(43);
        heap.hp.add(26);

        System.out.println("Before:" + heap.hp);

        int delete = heap.extractMin();
        System.out.println(delete);
        System.out.println(heap.hp);

        
    }

    public int extractMin(){
        if(hp.isEmpty()){
            throw new NoSuchElementException("Heap is empty");
        }

        int min = hp.get(0);
        int last = hp.remove(hp.size()-1);

        if(!hp.isEmpty()){
            hp.set(0, last);

            heapifyDown(0);
        }
        return min;

    }

    private void heapifyDown(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;

        if(left < hp.size() && hp.get(left) < hp.get(smallest)){
            smallest =  left;
        }

        if(right < hp.size() && hp.get(right) < hp.get(smallest)){
            smallest = right;
        }

        if (smallest != i) {
            int temp = hp.get(i);
            hp.set(i, hp.get(smallest));
            hp.set(smallest, temp);

            heapifyDown(smallest);
        }

    }


}
