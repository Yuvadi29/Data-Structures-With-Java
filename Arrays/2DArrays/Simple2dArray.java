/*We will simply print 2d Array with default values */

import java.util.*;

public class Simple2dArray {

    public static void main(String[] args) {

        // Declaring rows and columns
        int rows = 4;
        int columns = 4;

        int[][] array = new int[rows][columns];

        int value = 1;
        // Iterating through the rows
        for (int i = 0; i < rows; i++) {
            // Iterating through the columnns
            for (int j = 0; j < columns; j++) {
                // Store the value at the indexes
                array[i][j] = value;
                value++;
            }
        }

        System.out.println("Array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}
