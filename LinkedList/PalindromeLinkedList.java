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

    // Get the last Node
    public Node getLastNode(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current;
    }

    // Reverse a linked list
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
        if (head == null) {
            return false;
        }

        // Create a reversed copy of the linked list
        Node reversed = reverseLinkedList(head);

        // Compare the original and reversed linked lists
        while (head != null && reversed != null) {
            if (head.val != reversed.val) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }

        // If both linked lists match, it's a palindrome
        return true;
    }
}
