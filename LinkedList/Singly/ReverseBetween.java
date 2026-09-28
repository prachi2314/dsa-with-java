package Singly;
class Node{
    int data;
    Node next;
}

public class ReverseBetween {
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

        Node head = reverseBetween(first, 1, 4);
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public  static Node reverseBetween(Node head, int left, int right){
        Node dummy = new Node();
        dummy.next = head;

        Node prev = dummy;

        for(int i=1; i<left; i++){
            prev = prev.next;
        }

        Node current = prev.next;

        for(int i=0; i<right-left; i++){
            Node temp = current.next;
            current.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return  dummy.next;


    }
}
