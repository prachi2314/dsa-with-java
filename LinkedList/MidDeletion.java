class Node{
    int data; 
    Node next;
}

public class MidDeletion {
 
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

        Node head = first;
        Node newhead = removeElements(head, 20);
        Node current = newhead;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;    
        }
    }  

    public static Node removeElements(Node head, int val) {
        while (head != null && head.data == val) {
            head = head.next;
        }

        if(head == null){
            return null;
        }

        Node previous = head;
        Node current = head.next;
        
        while (current != null) {
            if (current.data == val) {
                previous.next = current.next;
                current = current.next;
            }else{
                previous = current;
                current = current.next;
            }
        }
        
        return head;
    }
}
