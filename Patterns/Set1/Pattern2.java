package Set1;
/*Simple Star Pattern with equal rows and columns is printed here 
 1 1 1
 2 2 2 
 3 3 3
*/


import java.util.*;

class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();

        int i = 1; //Initialise row as 1

        while (i <= n) {
            // Har row ke liye chalega i, first second third likewise
            int j = 1;
            while (j <= n) {
            // Har column ke liye chalega j, first second third likewise
                System.out.print(i); //We print the value of i here at that particular iteration
                j++;
            }
            System.out.println();
            i++;
        }
    }
}