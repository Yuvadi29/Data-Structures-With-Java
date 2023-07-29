//We have an array of integers, we have to find how to many of them contain even number of digits. 
// Iterate through the array and if after the iteration we get the length of array divisible by 2 then count them. else dont . 

import java.util.*;

class EvenDigit {
    static int findNumbers(int[] nums) {

        //To Keep count of result
        int result = 0;

        // To get the number of digits we will have to keep on dividing it with 10
        for(int i = 0; i < nums.length; i++) {
            if(numDigit(nums[i]) % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    static int numDigit(int n) {
        // To keep count of the numbers
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {5555,901,820,1771};

        System.out.println(findNumbers(nums));
    }
}