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

public class Height {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(20);
        root.right.left = new Node(5);
        root.left.right = new Node(21);

        int max = height(root);
        System.out.println(max);
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lefthi = height(root.left);
        int righi = height(root.right);

        return 1 + Math.max(lefthi, righi);
    }
}
