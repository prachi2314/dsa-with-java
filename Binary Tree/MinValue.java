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

public class MinValue {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(15);
        root.right.left = new Node(3);

        int min = minValue(root);
        System.out.println(min);
    }

    public static int minValue(Node root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = minValue(root.left);
        int righMin = minValue(root.right);

        return Math.min(root.data, Math.min(leftMin, righMin));
    }
}
