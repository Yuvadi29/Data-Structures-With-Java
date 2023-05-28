/*You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.

Approach:
Iterate through the array and fnd the largest number
Give it the title maxIndex
Iterate again and see if index of other numbers < maxIndex 

*/

public class TwiceLargest {

    public static int dominantIndex(int[] nums) {
        // Finding the largest number
        int greatest = nums[0];
        // To get the index of that greatest element
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > greatest) {
                greatest = nums[i];
                maxIndex = i;
            }
        }

        // Scanning again to find value not equal to greatest value and it should be < 2 * greatest
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] * 2 > greatest) {
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6};
        System.out.println(dominantIndex(nums));
    }
}
