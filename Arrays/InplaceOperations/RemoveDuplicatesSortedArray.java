/*We are given an array in ascending order. We have to remove duplcicates in-place such that each unique element appears only once. Order of Elements should be the same. Then return number of unique elements. For eg. [1,1,2]
O/P is [1,2,_].

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Approach would be:
Iterate through array
check the unique elements and unique elements = k
nums[] = nums[k]
*/

import java.util.*;

class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            // Checking to see if the consecutive elements are same or not
            if (nums[i] != nums[i - 1]) {
                // If not same then, wo index ko ham element se equate kar denge and increment insertIndex value
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 2 };

        System.out.println(removeDuplicates(nums));
    }
}