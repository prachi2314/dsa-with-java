import java.util.*;

public class BFS {
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

        bfs(gr, 0, V);  
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> gr, int u, int v){
        gr.get(u).add(v);
        gr.get(v).add(u);
    }

    public static void bfs(ArrayList<ArrayList<Integer>> gr, int start, int V){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for(int neighbour: gr.get(curr)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }
}
