/*We are given 2 non-negative numbers num1 and num2 represented in form of linkedList. The digits in the LinkedList are store in reverse order and each node contains a single digit.
 * Calculate the sum of 2 numbers and return the head of sum list.
 * 
 * For eg: num1 = 1 -> 2 -> 3 -> NULL
 *         num2 = 4 -> 5 -> 6 -> NULL
 * Output: 5 -> 7-> 9 
 * Num1 represents 321 and Num2 represents 654 and 321 + 654 = 975
 * 
 * 
 * Expected Time Complextity is O('m' + 'n')
*/

public class AddTwoNumbers {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public Node reverseLinkedList(Node head) {
        // Iterate the head1 and reverse it
        Node newHead = null;
        while (head != null) {
            Node next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public Node addTwoNumbers(Node head1, Node head2) {

        Node reversedHead1 = reverseLinkedList(head1);
        Node reversedHead2 = reverseLinkedList(head2);
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (reversedHead1 != null || reversedHead2 != null) {
            int x = (reversedHead1 != null) ? reversedHead1.val : 0;
            int y = (reversedHead2 != null) ? reversedHead2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;

            if (reversedHead1 != null)
                reversedHead1 = reversedHead1.next;
            if (reversedHead2 != null)
                reversedHead2 = reversedHead2.next;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }

        return reverseLinkedList(dummy.next);
    }

}
