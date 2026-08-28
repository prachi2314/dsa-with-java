class Node{
    int data; 
    Node next;
}

public class BegInsertion {
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.data = 10;
        second.data = 20; 
        third.data = 30;

        first.next = second;
        second.next = third;
        third.next = null;

        Node head = insertAtEnd(first, 40);
        
        Node newhead = insertAtBeginning(head, 5);
        head = newhead;
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;   
            // current.next = insertAtEnd(head, 40); 
        }
        
        
    }

    public static Node insertAtBeginning(Node head, int value) {
        Node s = new Node();
        s.data = value; 
        s.next = head;
        head = s;
        return head;
    }

    public static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        if(head == null){
            head = newNode;
            return head;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;

        return head;
    }
}
