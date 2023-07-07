/*We are given an array. We have to return the length of the longest sub array whose sum is 0
 * For eg: {1,-2,4,1}
 * Subarrays : (1),(-2),(4),(2)
 *             (1,-2),(-2,4),(4,2)
 *             (1,-2,4),(-2,4,2)
 *             (1,-2,4,2)
 * Out of these the pair where we get the sum of subarray as 0 is (-2,4,2) so the length of the longest subarray with the sum being 0 is 3.
 * 
 * Approach:
 * Create a map and push all the elements into it
 * keep a variable to keep track of the length of longest subarray
 * We have to try to take the combinations from single to double to triple to whole as a one. 
 */

import java.util.*;

public class LongestSubarraySumZero {

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        Map<Integer, Integer> subMap = new HashMap<>();

        int countofSubarray = 0;
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {

            // Taking the sum of elements
            sum = sum + arr.get(i);

            if (sum == 0) {
                countofSubarray = i + 1;
            } else if (subMap.containsKey(sum)) {
                int startIndex = subMap.get(sum);
                countofSubarray = Math.max(countofSubarray, i - startIndex);
            } else {
                subMap.put(sum, i);
            }
        }

        return countofSubarray;

    }

}