/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * 
 * Approach:
Sort the array => {1,2,2,3,3,4}
Take 2 pointers i ands j. 
i should be on initial element 1 and j should be on last element 4  
i will increase and j will decrease till i and j are not equal
Find the sum of elements which make up the target value
find the length of the array of elements in above step .
if it is minimum then others return length 
else return 0
*/

public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int lengthofSubArray = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {
            // Find the sum
            sum += nums[j];

            while (sum >= target) {
                lengthofSubArray = Math.min(lengthofSubArray, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }
        return lengthofSubArray != Integer.MAX_VALUE ? lengthofSubArray : 0;
    }
}
