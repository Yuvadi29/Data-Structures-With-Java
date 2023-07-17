/*We are given an array of N integers. We have to rearrange the elements such that all negative number appear before all positive numbers. 
 * For eg: i/p: {1,-2,2,4,-4,5}
 * op: {-2,-4,1,2,4,5}
 * Here the Order need not be considered
 * 
 * Approach:
 * Iterate the array
 * take 2 arrays and their indexes
 * Iterate the arrays and see if that is less than 0 then add it into the negative array
 * else add it to positive array
 * Make an array result and then add both of them in that. 
 * 
*/

import java.util.*;

public class MoveNegtoBeginning {

    public static int[] separateNegativeAndPositive(int a[]) {

        int[] result = new int[a.length];
        int negativeIndex = 0;
        int positiveIndex = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                result[negativeIndex] = a[i];
                negativeIndex++;
            } else {
                result[positiveIndex] = a[i];
                positiveIndex--;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] a = { 1, -2, 2, 4, -4, 5 };

        System.out.println(separateNegativeAndPositive(a));
    }

}
