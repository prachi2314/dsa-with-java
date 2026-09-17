class Node{
    int data; 
    Node next;
}

public class FindDuplicate {
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();

        first.data = 10;
        second.data = 10; 
        third.data = 30;
        fourth.data = 40;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        Node head = first;
        Node newhead = removeDuplicates(head);
        Node current = newhead;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;    
        }
    }

    public static Node removeDuplicates(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}
