/*We are given the head of a linked list. We have to remove the nth node from end of the list and return its head.
 * Approach:
 * Reverse the LinkedList
 * Remove the nth node
  */

public class RemoveNthNodeFromEnd {
    
    class Node {
        int val;
        Node next;

        Node(int x){
            this.val = x;
        }

        Node(int x, Node next) {
            this.val = x;
            this.next = next;
        }

        public Node removeNthNodeFromEnd (Node head, int n){

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
            while(ptr2.next  != null){
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }

            // Remove the node
            ptr1.next = ptr1.next.next;

            return dummy.next;

        }
    }
}
