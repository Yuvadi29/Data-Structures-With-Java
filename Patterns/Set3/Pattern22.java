package Set3;
/*Triangular pattern where the columns depend on rows
   1 2 3 4 5 5 4 3 2 1
   1 2 3 4 * * 4 3 2 1
   1 2 3 * * * * 3 2 1
   1 2 * * * * * * 2 1
   1 * * * * * * * * 1

   So it is divided into left number triangle, star pattern and right triangle
*/

import java.util.*;

class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n) {

            //Left Triangle Numbers from 1 to n - i +1
            int j = 1;
            while(j <= n - i + 1) {
                System.out.print(j + " ");
                j++;
            }

            //Star Pattern (i-1)*2 times
            int star = 1;
            while(star <= (i - 1 ) * 2) {
                System.out.print('*' + " ");
                star++;
            }

            // Right Triangle Numbers from n - i - 1 to 1
            int right = n - i + 1;
            while(right >= 1) {
                System.out.print(right + " ");
                right--;
            }
            System.out.println();
            i++;
        }
    }
}