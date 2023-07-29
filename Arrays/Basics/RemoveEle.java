// Here we are given an integer array and an integer. We have to remove all occurences of the integer in the array. Order change hoga chalega. In the end we need to return length of remaining elements after deleting all occurances of integer.

// For eg agar we have [3,2,2,3] and integer is 3 then we will remove 3 and resulting array will be [2,2]. So we can do one thing . Delete the elements at that given index and then shift the elements to the left. 
// 1. Take a variable count which will count no of elements except val
// 2. Scan elements from left to right
// 3. If element is not equal to value, replace it with count

import java.util.*;

class RemoveEle {
    static int removeElement(int[] nums, int val) {
        // Keep a track of elements other than value
        int count = 0;

        // Iterate through array
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                // nums[count++] = nums[i];
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,2,3,35,4};
        int val = 3;

        System.out.println(removeElement(nums, val));
    }
}