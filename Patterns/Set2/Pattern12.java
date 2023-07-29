
/*Alphabetical pattern where the rows and columns are same
    A B C 
    A B C 
    A B C 
*/

import java.util.*;

class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i++;    
        }
    }
}