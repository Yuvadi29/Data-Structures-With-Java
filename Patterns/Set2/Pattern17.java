/*Triangular pattern where the columns depend on rows
    A
    B C
    C D E
    D E F G
*/

import java.util.*;

class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();


        int i = 1;
        while(i<=n) {
            int j = 1;
            while (j<=i) {
                char ch = (char) ('A' + i + j - 2);
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}