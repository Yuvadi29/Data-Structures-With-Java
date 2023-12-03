public class AddafterNodeDoublyLL {

    class DoublyLinkedList {
        int val;
        DoublyLinkedList next, prev;

        DoublyLinkedList(int x) {
            this.val = x;
        }
    }

    public static addAfterNode(DoublyLinkedList prevNode, int data){
        // Check if given prevNode is null
        if(prevNode == null){
            System.out.println("Previous node cannot be NULL");
            return;
        }

        // Allocate node and put in the data
        DoublyLinkedList newNode = new DoublyLinkedList(data);

        // Make next of new node as next of prev node
        newNode.next = prevNode.next;

        // Make next of prev node as new node
        prevNode.next = newNode;

        // Make prevNode as previous of new node
        newNode.prev = prevNode;

        // Change previous of new node next node
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
    }
}
