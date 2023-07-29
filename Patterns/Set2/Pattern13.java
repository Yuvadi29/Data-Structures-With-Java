
/*Alphabetical pattern where the rows and columns are same
    A B C 
    D E F 
    G H I 
*/

import java.util.*;

class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            char countLetter = 'A';
            while (j <= n) {
                System.out.print(countLetter + " ");
                countLetter++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}