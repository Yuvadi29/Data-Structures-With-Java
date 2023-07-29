/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums. 
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6].
We have to find the disappeared numbers
Approach:
Sort the array
Find out the largest number
n = largest number
Iterate through the array.
if a[i + 1] - a[i] = 1:
    aage badho
nextnum = a[i]
nextnum++;
    count++


*/

import java.util.*;

public class DisapperedNumber {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

       List<Integer> disappeared = new ArrayList<>();

        // Mark the visited numbers as negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Find the index with positive values
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                disappeared.add(i + 1);
            }
        }
        return disappeared;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 4, 5, 1 };

        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
}
