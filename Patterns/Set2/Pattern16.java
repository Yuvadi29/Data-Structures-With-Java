/*Triangular pattern where the columns depend on rows
    A
    B C
    D E F
    G H I J
*/

import java.util.*;

class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        // scanner.close();

        char ch = 'A';
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(ch + " ");
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
