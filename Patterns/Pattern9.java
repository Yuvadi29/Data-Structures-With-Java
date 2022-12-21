
/*Simple Star Pattern with equal rows and columns is printed here 
1
2 3
3 4 5
5 6 7 8
*/
import java.util.*;

class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            int value = i;
            while (j <= i) {
                System.out.print(value + " ");
                value++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}