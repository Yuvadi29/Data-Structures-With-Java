/*We are given a matrix. We have to find if it is symmetric or not. Symmetric matrix means the given matrix is equal to its transpose.
 * Approach:
 * Initialise a variable to store transpose value
 * Pass the given matrix into the transpose variable to find its transpose
 * Compare both the matrix, if they are equal return true else return false.
 */

import java.util.*;

public class SymmetrixMatrix {

    public static boolean isMatrixSymmetric(int[][] matrix) {

        int transpose[][] = new int[matrix.length][matrix[0].length];

        // Find the transpose of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        // Check if the row and column are not same , and if element of matrix and transpose are not same return false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i!=j && matrix[i][j] != transpose[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(isMatrixSymmetric(matrix));
    }

}