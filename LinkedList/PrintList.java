class Node{
    int data;
    Node next;
}

public class PrintList {
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
        // printList(head);
        boolean result = findMiddle(head);
        System.out.println(result);
        // System.out.println(reverseList(head));

        // Node current = newhead;
        // while (current != null) {
        //     System.out.println(current.data);
        //     current = current.next;
        // }
    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        
    }

    public static Node reverseList(Node head) {

        if(head == null){
            return null;
        }
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }

    public static boolean findMiddle(Node head) {
        

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
