/*We are designing our own linkedlist using Singly LinkedList */

import java.util.LinkedList;

public class OperationSinglyLL {

    // Initialise the Singly LinkedlIst
    int length;
    Node head;

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    // Initialise LinkedlIst
    public MyLinkedList(){
        // Initially no length and no values
        this.length = 0;
        this.head = null;
    }

    // Get value of index node in linkedlist
    public int get(int index) {
        // Checking for the length and index values of the linkedlist
        if (index < 0 || index >= this.length) {
            return -1;
        } else {
            int counter = 0;
            Node curr = head;
            while (counter != (index)) {
                curr = curr.next;
                counter++;
            }
            return curr.val;
        }
    }

    // Add node val before first element of linkedlist
    public void addAtHead(int val) {
        // Create a new Node to add the element
        Node newNode = new Node(val);
        // Change the new node's next to current next
        newNode.next = this.head;
        // Update the current value
        this.head = newNode;
        // Increase the length
        this.length++;
    }

    // Add node val after last element of linkedlist
    public void addAtTail(int val) {
        // If length is 0, it will be added at the head only
        if (this.length == 0) {
            addAtHead(val);
            return;
        }

        // Create a new Node
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        this.length++;
    }

    // Add node of value val before index node in linkedlist
    public void addAtIndex(int index, int val) {
        // Create a new Node
        Node newNode = new Node(val);
        Node temp = head;
        int counter = 0;
        if ((index) == this.length) {
            addAtTail(val);
            return;
        }
        if(index > this.length){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        while(counter != (index - 1)){
            temp = temp.next;
            counter++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
    }

    // Delete index node in linkedlist
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= this.length){
            return;
        }
        Node curr = head;
        if(index == 0){
            head = curr.next;
        } else {
            Node current = head;
            Node pre = null;
            int counter = 0;
            while(counter != index){
                pre = current;
                current = current.next;
                counter++;
            }
            pre.next = current.next;
            this.length--;
        }
    }

    // public static void main(String[] args) {
    //     LinkedList obj = new LinkedList();
    //     int param_1 = obj.get(index);
    //     obj.addAtHead(val);
    //     obj.addAtTail(val);
    //     obj.addAtIndex(val);
    //     obj.deleteAtIndex(val);

    // }
}
