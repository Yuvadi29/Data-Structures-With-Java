/* We are given an ArrayList ARR of integers. We have to find the second largest element in it.
An Array ARR of integers. 
Find Second Largest element in it
Approach:
Sort in ascending order
last element will be largest.
find last element.
iterate from last element
if repeated element, then move backward 
second largest = last - 1;
return second largest.
 */

import java.util.*;

public class SecondLargestElem {

    public static int findSecondLargest(int n, int[] arr) {

        Arrays.sort(arr);

        int greatest = arr.length - 1;

        for (int i = greatest; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i - 1];
            }
            arr[i] = arr[i - 1];
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2 };
        int n = 0;

        System.out.println(findSecondLargest(n, arr));

    }
}
