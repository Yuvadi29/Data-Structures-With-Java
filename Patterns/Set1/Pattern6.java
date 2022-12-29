package Set1;
import java.util.Scanner;

/*Simple Star Pattern with equal rows and columns is printed here 
*
* *
* * *
* * * *
*/

class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
