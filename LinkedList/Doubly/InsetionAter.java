class Node{
    int data;
    Node prev;
    Node next;
}

public class InsetionAter {
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
        insertAfter(head, 25);
        Node current = head;
        

        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void insertAfter(Node current, int val){
        Node newNode = new Node();
        newNode.data = val;

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;


    }
}
