/* */

import java.util.*;

class RemoveElem {

    static int removeElement(int[] nums, int val) {
        // Keep a track of elements other than value
        int count = 0;

        // Iterate through array
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int val = 2;

        System.out.println(removeElement(nums, val));
    }    
}
