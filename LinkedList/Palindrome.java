class Node{
    int data;
    Node next;
}

public class Palindrome {
    public static void main(String[] args) {

        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        Node fifth = new Node();
        Node sixth = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;
        fourth.data = 30;
        fifth.data = 20;
        sixth.data = 10;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;

        System.out.println(isPalindrome(first));

        
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

    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        Node first = head;
        Node second = reverse(slow);

        while (second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
