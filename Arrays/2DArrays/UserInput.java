/*We implement 2d array while taking input from user */

import java.util.*;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of Columns: ");
        int columns = sc.nextInt();

        int[][] newArray = new int[rows][columns];

        // Loop into array and store the values in them
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
