package Set1;
/*Simple Star Pattern with equal rows and columns is printed here 
3 2 1
3 2 1
3 2 1
*/

import java.util.*;

class Pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        int i = 1;
        
        while(i<=n) {
            // Har row ke liye chalega i, first second third likewise

            int j = 1;
            while(j<=n){
            // Har column ke liye chalega j, first second third likewise

                System.out.print(n - j + 1 + " ");
                //Yaha we used n-j+1 kyuki we can see in the columns that unka value decrease ho raha hai and this is the equation that we got from the given pattern
                j++;
            }
            System.out.println();
            i++;
        }
    }
}