/*We are given head of linkedlist. We have to group the nodes with odd indices followed by even indices and return the reorderd list.
 * Eg: 1->2->3->4->5
 * Op: 1->3->5->2->4 
 * 
 */

public class OddEvenLinkedList {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public Node oddEvenList(Node head) {

        if(head == null){
            return null;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        // Iterating through the loop
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;

        }

        odd.next = evenHead;
        
        return head;
    }
}
