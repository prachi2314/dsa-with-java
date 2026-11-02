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

public class BST_Insertion {
    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 5);
        root = insert(root, 25);
        root = insert(root, 15);
        root = insert(root, 105);
        root = insert(root, 56);
        root = insert(root, 45);

        inorder(root);
        
    }

    public static Node insert(Node root, int key){
        if (root == null) {
            return new Node(key);
        }

        if (key<root.data) {
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }  
}
