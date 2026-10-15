class Node{
    int data;
    Node prev;
    Node next;
}

class InsertionBefore{
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;
        fourth.data = 40;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        first.prev = null;
        second.prev = first;
        third.prev = second;
        fourth.prev = third;
        
        Node head = insertBefore(first, 30, 25);;
        
        Node current = head;
        

        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node insertBefore(Node head, int val, int newValue){
        Node current = head;

        while (current != null && current.data != val) {
            current = current.next;
           
        }

        if (current == null) {
            return head;
        }

        Node newNode = new Node();
        newNode.data = newValue;
        
            if (current.prev == null) {
            newNode.next = current;
            newNode.prev = null;
            current.prev = newNode;
            return newNode;
            }

            if (current.data == val) {
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev.next = newNode;
                current.prev = newNode;

            }
        
        return head;
    }
}