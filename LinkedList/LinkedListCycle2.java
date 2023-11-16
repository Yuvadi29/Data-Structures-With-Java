/*We are given head of the linkedlist. We have to determine if it has a cycle in it.
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */

public class LinkedListCycle2 {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return null; // No cycle
        }

        // Move one pointer back to the head
        slow = head;

        // Move both pointers one step at a time until they meet
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // Return the starting node of the cycle
    }

}
