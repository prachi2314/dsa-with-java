class Node{
    int data; 
    Node next;
}

public class BegDeletion {
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

        Node head = deleteAtBeginning(first);
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;    
        }
    }

    public static Node deleteAtBeginning(Node head) {
        if(head == null){
            return null;
        }

        Node newhead = head.next;
        return newhead;
    }
}


