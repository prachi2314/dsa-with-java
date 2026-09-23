class Node{
    Node next;
    int data;
}

public class Rotate {
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

        Node head = rotateRight(first, 2);
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node rotateRight(Node head, int k) {
        if(head==null || head.next == null){
            return null;
        }

        int length = 0;
        Node tail = null;
        Node current = head;

        while (current!=null) {
            length++;
            tail = current;
            current = current.next;
        }
        k = k%length;
        if (k==0) {
            return head;
        }
        int moves = length - k - 1;
        current = head;
        int i = 0;

        while (i < moves) {
            current = current.next;
            i++;
        }
        

        Node newHead = current.next;
        current.next = null;
        tail.next = head;
        return newHead;
    }
}
