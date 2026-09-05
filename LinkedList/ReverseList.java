class Node{
    int data; 
    Node next;
}

public class ReverseList {
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

        Node head = reverse(first);
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;    
        }
    }

    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        Node previous = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
