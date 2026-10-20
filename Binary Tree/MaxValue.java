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

public class MaxValue {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(20);
        root.right.left = new Node(5);
        root.left.right = new Node(21);

        int max = maxValue(root);
        System.out.println("Max value: " + max);
    }

    public static int maxValue(Node root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int rightMax = maxValue(root.right);
        int leftMax = maxValue(root.left);

        return Math.max(root.data, Math.max(rightMax, leftMax));

    }
}
