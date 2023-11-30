/*We are given a linkedlist consisting of N nodes with integer values. We have to perform insertion sort and print final list
 * Insertion sort is a sorting algorithm that removes one element from input data, finds location it belongs within sorted list and inserts it there.
 */
public class InsertionSort {

    static class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public static Node insertionSortLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        // pointer 1
        Node prev = dummy;
        // pointer 2
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;

            // Find correct position to insert current Node
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert current node into the sorted region
            current.next = prev.next;
            prev.next = current;

            // Move to the next node
            current = nextNode;
            prev = dummy;
        }

        return dummy.next;
    }
}
