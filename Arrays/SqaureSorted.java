// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].

import java.util.*;

public class SqaureSorted {
    static int[] sortedSquares(int[] nums) {

        int squared = 0;

        // Iterating the array
        for (int i = 0; i < nums.length; i++) {
            squared = nums[i] * nums[i];
            nums[i] = squared;
        }

        // Sorting the array
        Arrays.sort(nums);
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };

        System.out.println(sortedSquares(nums));
    }
}
