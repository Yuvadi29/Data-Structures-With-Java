/*Let us see to add elements at end of LinkedList
 * At the end:
 * We will see if head pointer is null or not. Next we will see the oiubter 'p' which will point Node after which the new node is to be inserted
 */

public class AddatEndDoublyLL {

    class DoublyLinkedList {
        int val;
        DoublyLinkedList next, prev;

        DoublyLinkedList(int x) {
            this.val = x;
        }
    }

    public static addAtEnd(DoublyLinkedList head, int data){

        DoublyLinkedList newNode = new DoublyLinkedList(data);

        // Initialise value and point next of new node to null
        newNode.val = data;
        newNode.next = null;

        if(head!=null){
            head = newNode;
            newNode.prev = null;
            return;
        }

        // initialise a new node
        DoublyLinkedList temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
}
