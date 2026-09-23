class Node{
    int data;
    Node next;
}

public class DeleteAllDuplicates {
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        Node fifth = new Node();
        

        first.data = 10;
        second.data = 20;
        third.data = 20;
        fourth.data = 30;
        fifth.data = 30;
        

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        Node head = deleteAllDuplicates(first);
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node deleteAllDuplicates(Node head){
        Node dummy = new Node();
        dummy.next = head;

        Node previous = dummy;
        Node current = head;

        while (current != null) {
            if (current.next!=null && current.data==current.next.data) {
                while (current.next!=null && current.data==current.next.data) {
                    current = current.next;
                }
                
                previous.next = current.next;
                current = current.next;
            }else{
                previous = current;
                current = current.next;
            }
        }

        return dummy.next;
    }
}
