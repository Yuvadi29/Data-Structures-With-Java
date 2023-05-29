/*We are given an array of length N. We have to find out the first missing positive integer .
 * i/p: [3,2,0,-1]
 * o/p: 1
 */

import java.util.*;

public class FirstMissingPositive {

    public static int firstMissing(int[] arr, int n) {

        // Sort the array
        Arrays.sort(arr);
        // -1,0,2,3

        // Since we have to find the smallest positive integer, we initialise leastNum
        // to 1
        int leastNum = 1;
        // Iterating through each element
        for (int i = 0; i < n; i++) {
            // If current array value is greater than leastNum means leastNum ka value is
            // missing
            if (leastNum < arr[i]) {
                return leastNum;
            }
            // if Current is positive, leastNum is incremented by 1
            if (arr[i] > 0) {
                leastNum++;
            } else {
                continue;
            }
        }
        return leastNum;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 0, -1 };
        int n = 4;

        System.out.println(firstMissing(arr, n));
    }
}
