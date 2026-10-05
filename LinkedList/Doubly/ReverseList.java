public class ReverseList {
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
        
        Node head = reverse(first);;
        
        Node current = head;
        

        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node reverse(Node head) {
        Node current = head;
        Node newHead = null;
        while (current!=null) {
            Node temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            newHead = current;
            current = current.prev;
        }
        return newHead;
    }
}
