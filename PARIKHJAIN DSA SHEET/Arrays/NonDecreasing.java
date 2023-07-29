/*We are given an array of N size. We are to check if it will be ascending if we change only 1 element. If it will return true else false.
 * Approach:
 * Initialize a variable count to 0, which will keep track of the number of elements that need to be changed.
 * Iterate from 0 to n-2
 * check if it is greater than next element. iF it is count + 1;
 * if count exceeds 1 at any point,  return false because it will be decreasing then
i = arr[i]; //Here i is the iteration value and arr[i] is the element
if(arr[i] <= arr[i+1]) {
    return true;
} 
return false;
    
 * 
 */

import java.util.*;

public class NonDecreasing {

    public static boolean isPossible(int[] arr, int n) {

        // Keep a track of changing values
        int count = 0;
        // Iterate through array and check condition
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                // If count is increasing it will not be 
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 6 };
        int n = 3;

        System.out.println(isPossible(arr, n));
    }
}
