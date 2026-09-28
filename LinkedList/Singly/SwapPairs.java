package Singly;
class Node{
    int data;
    Node next;
}

class SwapPairs{
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

        Node head = swapPairs(first);
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node swapPairs(Node head) {
        Node dummy = new Node();
        dummy.next= head;
        Node previous = dummy;

        while (previous.next!=null && previous.next.next!=null) {
            Node first = previous.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            previous.next = second;

            previous = first;
        }
        return  dummy.next;
    }
}