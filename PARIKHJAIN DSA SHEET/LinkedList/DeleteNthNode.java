/*We are given a LinkedList and a Number N. Find the Nth node from end of this linkedlist and delete it. Return the head of the new modified LinkedList. */

public class DeleteNthNode {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public Node removeNthFromEnd(Node head, int n) {
        // Handling special cases
        Node dummy = new Node(-1);
        dummy.next = head;

        Node ptr1 = dummy;
        Node ptr2 = dummy;

        // Moving second pointer 'n' spaces ahead
        for (int i = 0; i < n; i++) {
            ptr2 = ptr2.next;
        }

        // Move both now till ptr2.next != null
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // Remove the node
        ptr1.next = ptr1.next.next;

        return dummy.next;
    }
}
