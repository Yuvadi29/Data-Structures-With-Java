/*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

For eg: 3 2 1
We have to find the third maximum number.
Approach:
Iterate through the array.
Descending order me sort karo
Start wala will be maximum.
Second wala second maximum
Third wala third maximum.

If third wala not exists:
    return second wala

 */

import java.util.*;

public class ThirdMaxNumber {

    public static int thirdMax(int[] nums){
        
        // Sorting the array in Ascending order
        Arrays.sort(nums);

        // Taking count as 1
        int count = 1;
        // Finding out thirdmax number from array which will be third from the length.
        int thirdMax = nums[nums.length - 1];

        // Reverse iterate and check
        for (int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != nums[i+1]) {
                count++;
                // If count = 3 then equate value of thirdmax with current nums[i]
                if(count == 3){
                    thirdMax = nums[i];
                    break;
                }
            }
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};

        System.out.println(thirdMax(nums));
    }
}
