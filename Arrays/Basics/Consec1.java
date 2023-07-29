// //Find Maximum number of consecutive 1s in the array
// So we have to find the consecutive number of words in the array firstly we will take an array and then input any number of ones. So we will next traverse through the array and if the condition is that if tthat particular element of the array equals one then that will be counted else it will not be counted

import java.util.*;

class Consec1 {

    static int getLength(int nums[]) {
        //To keep a count of 1s
        int count = 0;
        //To get the 1s
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            //Reset count to 0 if 0 is found
            if(nums[i] == 0){
                count = 0;
            }
            //If 1 is found then increment count and update the value of result
            else {
                count++;
                result = Math.max(result, count);
            }
        }
        return result;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {1,1,1,1,1,1};

        System.out.println(getLength(nums));
    }
}