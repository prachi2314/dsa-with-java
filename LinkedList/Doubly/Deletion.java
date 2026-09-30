class Node{
    int data;
    Node prev;
    Node next;
}

public class Deletion {
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;
        fourth.data = 40;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        first.prev = null;
        second.prev = first;
        third.prev = second;
        fourth.prev = third;
        
        Node head = first;
        
        Node current = deleteNode(head, 20);
        

        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node deleteNode(Node head, int val){
        Node current = head;

        while (current != null && current.data != val) {
            current = current.next;
        }

        if (current==null) {
            return head;
        }

        if (current.prev == null) {
            if (current.next != null) {
                current.next.prev = null;
            }
            
            return  current.next;
        }
        
        if(current.next == null){
            current.prev.next = null;
            return  head;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        return head;
    }


}

