class Node{
    int data;
    Node next;
}

public class MergeList {
    public static void main(String[] args) {
        Node first1 = new Node();
        Node second1 = new Node();
        Node third1 = new Node();

        first1.data = 10;
        second1.data = 30;
        third1.data = 50;

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

        first2.data = 20;
        second2.data = 40;
        third2.data = 60;

        first2.next = second2;
        second2.next = third2;
        third2.next = null;

        Node head2 = first2;


        // -------------------------
        // Merge both lists
        // -------------------------
        Node mergedHead = merge(head1, head2);


        // -------------------------
        // Print merged list
        // -------------------------
        Node current = mergedHead;

        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }

        System.out.println("null");
        
    }

    public static Node merge(Node list1, Node list2) {
        Node dummy = new Node();
        Node current = dummy;

        while (list1 !=null && list2!=null) {
            if(list1.data<list2.data){
            current.next = list1;
            list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }
        

        current.next = (list1 != null) ?list1:list2;
        return dummy.next;
    }
}
