class Node{
    int data; 
    Node next;
}

public class FindCycle {
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
        fourth.next = first;

        boolean result = hasCycle(first);
        System.out.println(result);
    }

    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
