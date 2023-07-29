// We have an array of integers given in a non-decreasing order. We have to return an array which consists of the squares of each of the numbers in the ascending order 
// So traverse through the array and then return the square of all the elements

import java.util.*;

class SquareSort {
    static int[] sortedSquares(int[] nums) {

        // This variable will contain the squared value
        int squared = 0;

        // Iterating the array
        for (int i = 0; i < nums.length; i++) {
            //Squaring each element
            //Storing that value in the array
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