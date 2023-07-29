package Set3;
/*Triangular pattern where the columns depend on rows
    _ _ _ *
    _ _ * *
    _ * * *
    * * * *

    '_' are the spaces
*/

import java.util.*;

class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i<=n) {

            // Print the spaces
            int space = n - i;
            while(space > 0) {
                System.out.print(" ");
                space--;
            }

            // Print stars
            int j = 1;
            while (j<=i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}