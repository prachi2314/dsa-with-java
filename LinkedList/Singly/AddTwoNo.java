package Singly;
class Node{
    int data;
    Node next;
}

public class AddTwoNo {
    public static void main(String[] args) {
        Node first1 = new Node();
        Node second1 = new Node();
        Node third1 = new Node();

        first1.data = 1;
        second1.data = 3;
        third1.data = 5;

        first1.next = second1;
        second1.next = third1;
        third1.next = null;

        Node head1 = first1;


        // -------------------------
        // List 2: 20 → 40 → 60
        // -------------------------
        Node first2 = new Node();
        Node second2 = new Node();
        Node third2 = new Node();

        first2.data = 2;
        second2.data = 4;
        third2.data = 6;

        first2.next = second2;
        second2.next = third2;
        third2.next = null;

        Node head2 = first2;


        // -------------------------
        // Merge both lists
        // -------------------------
        Node mergedHead = addTwoNumbers(head1, head2);


        // -------------------------
        // Print merged list
        // -------------------------
        Node current = mergedHead;

        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }

        ;
        
    }

    public static Node addTwoNumbers(Node list1, Node list2) {
        Node dummy = new Node();
        Node current = dummy;
        int carry = 0;

        while (list1!=null || list2!=null || carry!=0) {
            int value1 = 0;
            int value2 = 0;

            if (list1!=null) {
                value1 = list1.data;
                list1 = list1.next;
            }

            if (list2!=null) {
                value1 = list2.data;
                list2 = list2.next;
            }

            int sum = value1+value2+carry;
            int digit = sum%10;
            carry = sum/10;

            current.next = new Node();
            current = current.next;
            current.data = digit;
        }
        return dummy.next;
    }
}
