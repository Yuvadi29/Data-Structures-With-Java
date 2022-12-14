/*Simple Star Pattern with equal rows and columns is printed here 
 * * *
 * * * 
 * * *
*/

import java.util.*;

class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows: ");
        int n = sc.nextInt(); // Taking the number of rows as input

        int i = 1; // Initialising i as row
        while (i <= n) {
            // Har row ke liye chalega i, first second third likewise
            int j = 1;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}