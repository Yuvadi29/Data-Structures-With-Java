// Deletion of an array element is almost same as that of insertion. Elements can be deleted from End, Mid and Start

import java.util.*;

class Deletion {
    public static void main(String[] args) {
        int[] array = new int[10];

        //Currently array has 0 elements
        int length = 0;

        // Adding elements in array
        for (int i = 0; i < 6; i++) {
            array[length] = i;
            length++;
        }
        // Displaying elements added
        System.out.println("Array Before Deletion");
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }

        //We reduce the length variable so that it is deleted from end
        // length--;
        // System.out.println("Array After Deletion from end");
        // for (int i = 0; i < length; i++) {
        //     System.out.println(array[i]);
        // }

        // To delete elements from start we will have to remove the first element and then shift all the elements to the left
        // for (int i = 1; i < length; i++) {
        //     array[ i - 1 ] = array[ i ]; //Shift all elements to left
        // }
        // length--;
        // System.out.println("Array After Deletion from start");
        // for (int i = 0; i < length; i++) {
        //     System.out.println(array[i]);
        // }

        // Deleting elements from anywhere i.e at an index. Here when we delete an element that space will be replaced by element to the right of it
        for (int i = 2; i < length; i++) { //We delete element at index 1
            array[ i - 1 ] = array[ i ]; //Shift all right elements to left to cover up empty space
        }
        length--;
        System.out.println("Array After Deletion from Index1");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
        
    }
}