class Node{
    Node next;
    int data;
}

public class RemoveNthFromEnd {
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
        

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        Node head = removeNthFromEnd(first, 2);
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node();
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        for(int i=0; i<=n; i++){
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return  dummy.next;
        
    }
}
