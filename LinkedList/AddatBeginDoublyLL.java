/*Let us see how can we add in different ways in Doubly Linkedlists.
 * 
 * -> At the Beginning:
 *  We will see if the head pointer is null or not. If it is not null, point the next of insertion node to the head and previous of it to NULL and then return the pointer value
 */

public class AddatBeginDoublyLL {
    
    class DoublyLinkedList {
        int val;
        DoublyLinkedList next, prev;
        DoublyLinkedList(int x){
            this.val = x;
        }
    }

    public static addtoStart(DoublyLinkedList head,int data){
        DoublyLinkedList newNode = new DoublyLinkedList(data);

        // Make next of new node as head and prev as null
        newNode.next = head;
        newNode.prev = null;

        // Change prev of head node to new node
        if(head!=null){
            head.prev = newNode;
        }

        // Move head to point new node
        head = newNode;
    }
}
