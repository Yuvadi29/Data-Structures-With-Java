/*Given a linkedlist, we have to find the middle element of the LinkedList 
 * Approach:
 * Traverse through the List
 * If count of nodes is n/2 return the n/2 elem
 * If count of nodes is not n/2 return the n/2 + 1 elem
*/

public class MiddleElem {
    
    Node head;
    class Node {
        int val;
        Node next;

        Node(int x){
            this.val = x;
        }
    }

    public Node middleNode(Node head){
        int length = 0;
        // Initialise a head value
        Node middleElem = head;

        while(middleElem != null){
            length++;
            middleElem = middleElem.next;
        }
       
        middleElem = head;
        for (int i = 0; i < length / 2; i++) {
            middleElem = middleElem.next;
        }
        return middleElem;
    }

}
