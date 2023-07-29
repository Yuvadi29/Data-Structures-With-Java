/*Alphabetical pattern where the rows and columns are same
    A B C 
    B C D 
    C D E
*/

import java.util.*;

class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n) {
                char ch = (char) ('A' + i + j - 2);
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}