class Node{
    int data;
    Node prev;
    Node next;
}

public class ReverseTraverse {
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
        
        Node head = first;
        reverseDisplay(head);
        
    }

    public  static void reverseDisplay(Node head){
        Node current = head;

        // for reaching last node
        while (current.next != null) {
            current = current.next;
        }

        // for backward traverse
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }
}
