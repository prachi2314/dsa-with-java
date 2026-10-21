import java.util.Queue;
import java.util.LinkedList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class BFS {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(20);
        root.right.left = new Node(5);
        root.left.right = new Node(21);

        levelOrder(root);
        
    }

    public static void levelOrder(Node root){
        if (root == null) {
            return ;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.println(curr.data);

            if (curr.left != null) {
                queue.offer(curr.left);
            }

            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
    }
}
