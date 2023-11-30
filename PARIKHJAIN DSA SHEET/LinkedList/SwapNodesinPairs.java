/*We are given a singly linkedlist. We have to swap every 2 adjacent nodes and return head of the modified linkelist
 * for eg: 1->2->3->4->5->6->7
 * Swap linkelist like (1,2),(3,4),(5,6)
 */

public class SwapNodesinPairs {
    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public static Node pairsSwap(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node currNode = head;
        Node newHead = head.next;

        // Travers until there are atleast 2 nodes left
        while (currNode != null && currNode.next != null) {
            // Swap data
            Node temp = currNode.next;
            currNode.next = currNode.next.next;
            temp.next = currNode;
            currNode = currNode.next;
            if (currNode != null && currNode.next != null) {
                temp.next.next = currNode.next;
            }
        }

        return newHead;
    }
}
