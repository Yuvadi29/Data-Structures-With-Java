/*Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 * For eg: 
 * Input: nums = [1,4,3,2]
   Output: 4
   Explanation: All possible pairings (ignoring the ordering of elements) are:
   1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
   2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
   3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
   So the maximum possible sum is 4.

Approach:
Sort the array => [1,2,3,4]
Make pairs keeping the initial value as 1 and second as 2
Take 2 pointers i ands j. 
i should be on initial elements and j should be on last elemets 
i will increase and j will decrease till i and j are not equal

 */

import java.util.Arrays;

import java.util.Arrays;

public class ArrayPartition1 {
  public int arrayPairSum(int[] nums) {
    // Sorting the array
    Arrays.sort(nums);

    int maxSum = 0;

    for (int i = 0; i < nums.length; i += 2) {
      maxSum += Math.min(nums[i], nums[i + 1]);
    }

    return maxSum;
  }
}
