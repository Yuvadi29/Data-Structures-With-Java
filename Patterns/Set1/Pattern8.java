package Set1;
/*Simple Star Pattern with equal rows and columns is printed here 
1
2 3
4 5 6
7 8 9 10
*/
import java.util.*;

class Pattern8{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        int count = 1;
        while (i<=n) {
            int j = 1;
            while (j<=i) {
                System.out.print(count + " ");
                j++;
                count++;
            }
            System.out.println();
            i++;
        }
    }
}