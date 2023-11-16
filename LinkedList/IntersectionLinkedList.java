/*We are given heads of 2 singly linkedlist headA and headB, return the node at which 2 linkedlist intersect. 
 * 
 * Intersection
Logic:
Iterate Node 1 and Node 2 together
while(headA!=null && headA.next!=null || headB!=null && headB.next!=null){
headA = headA.next;
headB = headB.next;
if(headA.next == headB.next) {
return headA.next;
}
}
*/
public class IntersectionLinkedList {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Node tempA = headA;
        Node tempB = headB;

        while (tempA != tempB) {
            tempA = (tempA == null) ? headB : tempA.next;
            tempB = (tempB == null) ? headA : tempB.next;
        }

        return tempA; // This is the intersection point or null if there is no intersection
    }
}

