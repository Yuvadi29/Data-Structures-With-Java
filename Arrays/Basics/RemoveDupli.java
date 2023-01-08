// We are given array in ascending order, we have to remove the duplicates such that each unique element appears only once. ALso the order should remain the same
// For eg
//Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.

//Ek variable rakho to keep count of the numbers. 
// Traverse through the array, if the element consecutive to the one we are on is same, then remove the element at pre of the element and replace it by the one post the element

import java.util.*;

class RemoveDupli {
    static int removeDuplicates(int[] nums) {

        // Keep count of numbers
        int count = 0;

        int length = nums.length;
        // Traverse
        for (int i = 0; i < length - 1; i++) {

            if (nums[i] != nums[i + 1]) { // Consecutive number agar same nai hai
                count++; // Count that number
            } else {
                nums[i] = nums[i + 1]; // Replace the number before with the one after it
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        System.out.println(removeDuplicates(nums));
    }
}