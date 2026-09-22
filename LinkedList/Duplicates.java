class Node{
    int data;
    Node next;
}

public class Duplicates {

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        

        first.data = 10;
        second.data = 20;
        third.data = 20;
        fourth.data = 30;
        

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        Node head = deleteDuplicates(first);
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node deleteDuplicates(Node head) {
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