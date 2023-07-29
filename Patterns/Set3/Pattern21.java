package Set3;
    /*Triangular pattern where the columns depend on rows
    _ _ _ _ 1
    _ _ _ 1 2 1 
    _ _ 1 2 3 2 1
    _ 1 2 3 4 3 2 1 

    So it is divided into blank spaces, left triangle and right triangle
    */

import java.util.*;

class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {

            // Spaces
            int space = 1;
            while (space <= n - i) {
                System.out.print("  ");
                space++;
            }

            // Left triangle
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }

            // Right triangle
            int start = i - 1;
            while (start >= 1) {
                System.out.print(start + " ");
                start--;
            }
            System.out.println();
            i++;
        }
    }
}