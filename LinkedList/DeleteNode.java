class Node{
    int data;
    Node next;
}

public  class DeleteNode {

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.data = 10;
        second.data = 21; 
        third.data = 40;

        first.next = second;
        second.next = third;
        third.next = null;

        Node head = findNthFromEnd(first, 3);
        
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;    
        }

        // System.out.println(findNthFromEnd(head, 3));
    }

    public static void deleteNode(Node node) {
        Node current = node;
        current.data = current.next.data;
        current.next = current.next.next;
    }

    public static int length(Node head) {
        if(head == null){
            return  0;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return  count;
    }

    public static int getDecimalValue(Node head) {
        Node current = head;
        int result = 0;
        while (current!=null) {
            result = result*2 + current.data;
            current = current.next;
        }
        return  result;
    }

    public static Node findNthNode(Node head, int n) {
        Node current = head;
        int i=0;
        while (i < n-1) {
            current = current.next;
            i++;
        }
        return current;
    }

    public static Node findNthFromEnd(Node head, int n) {
        Node slow = head;
        Node fast =  head;
        int i = 0;

        while (i<n) {
            fast = fast.next;
            i++;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}