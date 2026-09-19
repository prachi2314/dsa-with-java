class Node{
    int data;
    Node next;
}

public class IntersectionNode {
    public static void main(String[] args) {
        Node first1 = new Node();
        Node second1 = new Node();
        Node third1 = new Node();
        Node fourth1 = new Node();
        Node fifth1 = new Node();


        first1.data = 10;
        second1.data = 30;
        third1.data = 50;
        fourth1.data = 40;
        fifth1.data = 60;

        first1.next = second1;
        second1.next = third1;
        third1.next = fourth1;
        fourth1.next = fifth1;
        fifth1.next = null;

        Node headA = first1;


        
        Node first2 = new Node();
        Node second2 = new Node();
        Node third2 = new Node();

        first2.data = 20;
        second2.data = 40;
        third2.data = 60;

        first2.next = second2;
        second2.next = third2;
        third2.next = null;

        Node headB = first2;
        Node intersection = getIntersectionNode(headA, headB);

        Node current = intersection;

        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        
        int count1 = 0;
        Node current1 = headA;
        while (current1 != null) {
            count1++;
            current1 = current1.next;
        }
        int count2 = 0;
        Node current2 = headB;
        while (current2 != null) {
            count2++;
            current2 = current2.next;
        }

        int diff = Math.abs(count1 - count2);
        current1 = headA;
        current2 = headB;

        if(count1>count2){
            int i=0;
            while (i<diff) {
                current1 = current1.next;
                i++;
            }
            
        }else{
            int i=0;
            while (i<diff) {
                current2 = current2.next;
                i++;
            }
        }

        while (current1 != current2) {
            current1 = current1.next;
            current2 = current2.next;
        }
        return current1;
    }
}
