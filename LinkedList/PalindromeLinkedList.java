/*We are given head of a linkedlist, return true if it is a palindrome or false otherwise
 * 
 * Palindrome means Forward Traversed = Reverse Traversed
 */

public class PalindromeLinkedList {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list using slow and fast pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node reversedHead = reverseLinkedList(slow);

        // Compare the first half and the reversed second half
        Node firstHalfPointer = head;
        Node secondHalfPointer = reversedHead;

        while (secondHalfPointer != null) {
            if (firstHalfPointer.val != secondHalfPointer.val) {
                return false;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }

        // Optional: restore the original list (if needed)
        // reverseLinkedList(reversedHead);

        return true;
    }
}
