/*We are given a matrix of size N*M where N are number of rows and M are number of columns and integer K. We have to rotate the matrix to the right K times.
 * Right rotation on a matrix is shifting each column to right side.
 * 
 * Approach:
 * THe last column will move to the first column
 * i represents the rows while j will represent the column
 * Create a new matrix of same size as input to store rotated elements
 * For each column, move its elements k positions to right in the new matrix
 * Print it
 * We have to print the array from the first row to the last row
 */

public class RotateMatrixtoRight {

    public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
        int[][] rotate = new int[n][m];

        // Rows
        for (int i = 0; i < n; i++) {
            // Columns
            for (int j = 0; j < m; j++) {
                int newColumnIndex = (j + k) % m; // Calulating columns index of new array
                rotate[i][newColumnIndex] = mat[i][j];
            }
        }
        return rotate;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int k = 1;

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 } };

        int[][] rotatedMat = rotateMatRight(mat, n, m, k);

        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(rotatedMat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
