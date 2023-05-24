//  We are given an array and we have to replace every element in that array with greatest element among its right and replace last element with -1.And then return array 

// Iterate through array
//See if any number at a particular index is greater than given index to its right. {
// if it is then replace it with current index number
// }

import java.util.*;

class ReplacewithGreatest {

    public static int[] replaceElements(int[] arr) {

        // Take a variable to store max value
        int maxx = arr[arr.length - 1];
        arr[arr.length - 1] = -1;

        // Iterate through the loop and till the second last element of array 
        for (int i = arr.length - 2; i >= 0; i--) {
            // Choose maximum of the values with Math.max function and store it in temp variable.
            int temp = Math.max(maxx, arr[i]);
            arr[i] = maxx;
            maxx = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };

        System.out.println(replaceElements(arr));
    }
}
