/*Triangular pattern where the columns depend on rows
    D
    C D
    B C D
    A B C D
*/

import java.util.*;

class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;

        while(i<=n) {
            int j = 1;
            char start = (char) ('A' + n - i);
            while (j<=i) {
                System.out.print(start + " ");
                start++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
