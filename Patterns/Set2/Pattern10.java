package Set2;
/*Simple Star Pattern with triangular pattern 
1
2 1
3 2 1
4 3 2 1
*/
import java.util.*;

class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int i=1;
        while (i<=n) {
            int j = 1;
            while (j<=i) {
                System.out.print( i - j + 1 + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}