class Node{
    int data; 
    Node next;
}

public class SearchValue {
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

        boolean result = search(first, 50);
        System.out.println(result);
    }

    public static boolean search(Node head, int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true;
            }

            current = current.next;
        }
        return false;
    }
}
