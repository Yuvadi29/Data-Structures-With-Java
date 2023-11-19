/*We are given head of a linkedlist and interger val, we habe to remove all nodes of linkedlist that has Node.val == val and return new head */

public class RemoveLinkedListElements {

    class Node {

        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }

        Node(int x, Node next) {
            this.val = x;
            this.next = next;
        }

        Node removeElements(Node head, int val) {
            // Traverse till the end
            while (head != null && head.val == val) {
                head = head.next;
            }

            Node current = head;

            while(current != null && current.next!=null){

                if (current.next.val == val) {
                    // Remove node with value
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }

            return head;
        }
    }
}
