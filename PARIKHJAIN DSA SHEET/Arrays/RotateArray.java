
import java.util.*;

public class RotateArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number of Steps to be Rotated: ");
        int k = sc.nextInt();

        int [] nums = {1,2,3,4,5};
        int temp = nums.length;

        for (int i = 0; i < nums.length; i++) {
            temp[(i-k) % nums.length] = nums[i];
        }

        // Copy temp in num
        nums = temp;

    }
}
