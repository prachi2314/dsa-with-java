class Node{
    Node prev;
    int data;
    Node next;
    Node child;
}

public class Child {
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        Node fifth = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;
        fourth.data = 40;
        fifth.data = 50;

        first.prev = null;
        second.prev = first;
        third.prev = second;
        fourth.prev = null;
        fifth.prev = fourth;

        first.next = second;
        second.next = third;
        third.next = null;
        fourth.next = fifth;
        fifth.next = null;

        second.child = fourth;

        Node head = first;
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
            
        }

        Node child = second.child;
        while (child!=null) {
            System.out.println(child.data);
            child = child.next;
        }
    }

    
}
