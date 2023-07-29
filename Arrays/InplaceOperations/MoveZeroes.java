/*We are given an integer array nums. We have to move all 0s to the end of it while maintaining relative order of non-zero elements.
  For e.g: [0,1,0,3,12]
  o/p: [1,3,12,0,0]

  Approach: 
  Iterate through the array with readPointer to find 0s 
  use writePointer to write 0s at the end of array
*/

import java.util.*;

public class MoveZeroes {

    public static int moveZeroes(int[] nums){

        int writePointer = 0;
        // If current element is not 0, we need to append it in front of last non 0 element found
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if(nums[readPointer] != 0){
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        
        // After processing is finished, all non-zero elements are in begining. We fill remaining array with 0
        for (int readPointer = writePointer; readPointer < nums.length; readPointer++) {
            nums[readPointer] = 0;
        }
        return writePointer;
        
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        System.out.println(moveZeroes(nums));
    }
    
}
