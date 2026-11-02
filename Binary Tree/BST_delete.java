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

class BST_delete{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.left.right = new Node(7);

        root = delete(root, 7);
        inorder(root);
    }

    public static Node delete(Node root, int key){
        if (root == null) {
            return null;
        }

        if (key<root.data) {
            root.left = delete(root.left, key);
        }else if (key>root.data) {
            root.right = delete(root.right, key);
        }else{
            if (root.left==null && root.right == null) {
                return null;
            }

            if (root.left==null) {
                return root.right;
            }

            if (root.right==null) {
                return root.left;
            }

            Node successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.data = successor.data;
            root.right = delete(root.right, successor.data);
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