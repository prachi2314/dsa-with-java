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

public class BST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(20);
        root.right.left = new Node(25);
        root.left.right = new Node(21);

        System.out.println(search(root, 25));
    }

    public static  boolean search(Node root, int key){
        Node curr = root;

        while (curr != null) {
            if(curr.data == key){
                return  true;
            }else if(key<curr.data){
                curr = curr.left;
            }else {
                curr = curr.right;
            }
        }
        return false;
    }
}
