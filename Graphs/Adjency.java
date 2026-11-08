import java.util.*;

public class Adjency {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> gr = new ArrayList<>();

        for(int i=0; i<V; i++){
            gr.add(new ArrayList<>());
        }  
        addEdge(gr, 0, 1);
        addEdge(gr, 0, 2);
        addEdge(gr, 1, 3);
        addEdge(gr, 2, 4);

        for(int i=0; i<V; i++){
            System.out.println(i + "-" + gr.get(i));
        }   

        
    }

    static void addEdge(ArrayList<ArrayList<Integer>> gr, int v, int u){
        gr.get(v).add(u);
        gr.get(u).add(v);
    }
}
