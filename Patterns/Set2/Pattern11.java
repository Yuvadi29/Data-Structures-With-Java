

/*Alphabetical pattern where the rows and columns are same
    A A A 
    B B B
    C C C
*/
import java.util.*;

class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {

            int j = 1;
            
            while (j <= n) {
            
                char ch = (char) ('A' + i - 1);
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
