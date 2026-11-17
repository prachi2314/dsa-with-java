import java.util.ArrayList;

public class Dfs {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> gr = new ArrayList<>();
        for(int i=0; i<V; i++){
            gr.add(new ArrayList<>());
        }
        addEdge(gr, 0, 1);
        addEdge(gr, 0, 2);
        addEdge(gr, 1, 3);
        addEdge(gr, 4, 5);
        // addEdge(gr, 0, 6);

        boolean[] visited = new boolean[V];

        int count = 0;

        for(int i=0; i<V; i++){
            if (!visited[i]) {
                count++;
                dfs(gr, i, visited);
            }
        }
        System.out.println("Component: "+ count);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> gr, int u, int v){
        gr.get(u).add(v);
        gr.get(v).add(u);
    }

    static void dfs(ArrayList<ArrayList<Integer>> gr, int curr, boolean[] visited){
        visited[curr] = true;
        System.out.print(curr+" ");

        for(int neigh: gr.get(curr)){
            if (!visited[neigh]) {
                dfs(gr, neigh, visited);
            }
        }

    }
}
