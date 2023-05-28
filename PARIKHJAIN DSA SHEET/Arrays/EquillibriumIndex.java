
/*We are given array of integers nums. We are to be found the pivot index. It is the index where the sum of all numbers left to it = sum of all numbers right to it.
 * Approach:
 * Calculate the sum of left numbers with sumLeft
 * Calculate the sum of right numbers with sumRight
 * If sumLeft=sumRight return i else return -1
 * 
 * Let's say we knew S as the sum of the numbers, and we are at index i. If we knew the sum of numbers leftsum that are to the left of index i, then the other sum to the right of the index would just be S - nums[i] - leftsum.

As such, we only need to know about leftsum to check whether an index is a pivot index in constant time. Let's do that: as we iterate through candidate indexes i, we will maintain the correct value of leftsum.


 */
import java.util.*;

public class EquillibriumIndex {

    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Sum of all the numbers
            int x = nums[i];
            sum = sum + x;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) {
                return i;
            }
            leftsum = leftsum + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1 };

        System.out.println(pivotIndex(nums));
    }
}
