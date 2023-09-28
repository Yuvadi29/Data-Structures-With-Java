/*Given two singly linked lists that are sorted in increasing order of node values, merge two sorted linked lists and return them as a sorted list. The list should be made by splicing together the nodes of the first two lists. 
 * Approach:
 * Create a new Node which points to null
 * Iterate through both the Lists and then compare 
 * Put the smaller one in the new List
*/

public class MergeSort {
    
    class Node {
        int val;
        Node next;

        Node(int x){
            this.val = x;
        }
    }

    Node mergeList(Node l1, Node l2){
        // If L1 is empty return L2 and vice versa
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        // Create a new dummy Node
        Node mergedList = new Node(-1);

        // Traversing till both elements do not reach to null 
        while(l1.next !=null && l2.next !=null){
            if(l1.val < l2.val ){
                mergedList.next = l1;
                l1 = l1.next;
            } else {
                mergedList.next = l2;
                l2 = l2.next;
            }
            mergedList = mergedList.next;
        }

        if(l1!=null) mergedList.next = l1;
        else mergedList.next = l2;

        return mergedList;
    }


}
