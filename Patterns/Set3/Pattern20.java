package Set3;
/*Triangular pattern where the columns depend on rows
   * * * *
   * * *
   * *
   * 
*/

import java.util.*;

class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i<=n) {
            int j = n - i + 1;
            while(j>=1){
                System.out.print('*' + " ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}