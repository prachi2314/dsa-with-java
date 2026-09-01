class Node{
    int data; 
    Node next;
}

public class EndDeletion {
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

        Node head = deleteAtEnd(first);
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;    
        }
    }

    public static Node deleteAtEnd(Node head) {
        if(head == null){
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
            
        return head;
    }
}
