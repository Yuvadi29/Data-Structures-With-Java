package Set1;
/*Simple Star Pattern with equal rows and columns is printed here 
1 2 3
4 5 6
7 8 9
*/

import java.util.*;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        int count = 1; //Initially used a variable to keep a track of numbers
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(count + " "); //Printed the numbers and incremented their value
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}