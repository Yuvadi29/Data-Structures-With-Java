/*Simple Star Pattern with equal rows and columns is printed here 
 1 2 3 4
 1 2 3 4
 1 2 3 4
 1 2 3 4
*/

import java.util.*;

class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Rows: ");
        int n = sc.nextInt();

        int i = 1;
            // Har row ke liye chalega i, first second third likewise
        while (i <= n) {
            int j = 1;
            while (j <= n) {
            // Har row ke liye chalega i, first second third likewise
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}