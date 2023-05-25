/* 
It is a technique to use repeated deletion. It consists of 2 pointers. 
=> readPointer will read all elements and find out the duplicates
=> writePointer will keep track of next position in front to write unique element we found.
*/ 


import java.util.*;

public class TwoPointer {

    public static int removeDuplicates(int[] arr) {
        
        // Checking to see if array is null or not
        if (arr == null){
            return 0;
        }

        // We won't touch the first element as it is already in correct place.
        int writePointer = 1;
        for (int readPointer = 1; readPointer < arr.length; readPointer++) {
            // If current element is different than earlier one
            if(arr[readPointer] != arr[readPointer - 1]){
                // Copy it into next position in front
                arr[writePointer] = arr[readPointer];

                writePointer++;
            }
        }
        return writePointer;
    }
    

    public static void main(String[] args) {
        int[] arr = {0,1,1,2,2,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
    }
}
