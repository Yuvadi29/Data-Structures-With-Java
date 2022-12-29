/*Triangular pattern where the columns depend on rows
    A
    B B
    C C C
*/

import java.util.*;

class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                char ch = (char) ('A' + i - 1);
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}