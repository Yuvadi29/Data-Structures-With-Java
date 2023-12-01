/*We are given an integer LinkedList. After M nodes, we have to take sum of the next N nodes and append that sum to the Linkedlist until we reach the end of the list
 * 
 */

public class AppendNodes {

import java.util.*;
import java.io.*;

class Node<Integer> {
    int data;
    Node<Integer> next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

 }

    public static Node<Integer> addNodes(Node<Integer> head, int n, int m) {
        // Write your code here.
        if (head == null)
            return head;
        Node<Integer> temp = head;
        while (temp != null && temp.next != null) {
            int count = m - 1;
            while (count-- != 0 && temp.next != null) {
                temp = temp.next;
            }
            count = n;
            int sum = 0;
            while (count-- != 0 && temp.next != null) {
                sum += temp.next.data;
                temp = temp.next;
            }
            if (sum != 0) {
                Node<Integer> temp1 = new Node<>(sum);
                if (temp.next != null) {
                    temp1.next = temp.next;
                }
                temp.next = temp1;
                temp = temp.next.next;
            }
        }
        return head;
    }
}