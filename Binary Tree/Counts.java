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

public class Counts {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(20);
        root.left = new Node(30);
        root.right.left = new Node(40);

        int tot = counts(root);
        System.out.println(tot);
    }

    public static int counts(Node root){
        if(root == null){
            return 0;
        }

        int count = 1 + counts(root.right) + counts(root.left);
        return  count;
    }
}
