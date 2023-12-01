public class SegregateOddEven {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public static Node segregateOddEven(Node head) {
        if (head == null) {
            return null;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        // Iterating through loop
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
