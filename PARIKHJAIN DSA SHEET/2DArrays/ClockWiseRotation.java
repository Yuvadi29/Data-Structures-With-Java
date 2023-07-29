/*We are given a square matrix. We have to rotate it by 90 degrees in anti-clockwise direction using Inplace operations
 * For eg:
 *    [ [1,2,3],
 *      [4,5,6],
 *      [7,8,9] ]
 * 
 * After 90 degree rotation in anti-clockwise direction
 *    [ [3,6,9],
 *      [2,5,8],
 *      [1,4,7] ]
 * 
 * 90 rotation anticlockwise, what I obeserved:
The last column becomes the first row
The middle column becomes the middle row
The first column becomes the last row

 * 
 * Approach:
 * Iterate through the array
 * Swap the position of first and last columns
 * Transpose the matrix
 */

import java.util.*;

public class ClockWiseRotation {

    public static void inplaceRotate(int[][] arr, int n) {
        // Here n is the size of the matrix
        n = arr.length;

        // Swapping
        for (int i = 0; i < n; i++) {
            // First Column
            int temp = arr[i][0];
            // Swapping
            arr[i][0] = arr[i][n - 1];
            arr[i][n - 1] = temp;

        }

        // Transposing
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {

    }
}
