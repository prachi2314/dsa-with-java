package Singly;
class Node{
    int data;
    Node next;
}

class ReorderList{
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

        Node head = reorderList(first);
        Node current = head;
        while (current!=null) {
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

    public static Node reorderList(Node head){

        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        second = reverse(second);
        Node first = head;

        while (first!=null && second != null) {
            Node firstNext = first.next;
            Node secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
        return head;
    }
}