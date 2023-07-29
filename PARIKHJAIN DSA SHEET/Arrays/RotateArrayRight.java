/*We are given an array nums. We are told to rotate it to right by k steps.
 * For eg [1,2,3,4,5,6] for k =3
 * o/p [4,5,6,1,2,3]
  Approach:
    For k = 1 o/p = [6,1,2,3,4,5]
    For k = 2 o/p = [5,6,1,2,3,4]
    For k = 3 o/p = [4,5,6,1,2,3]
    For k = 4 o/p = [3,4,5,6,1,2]
    For k = 5 o/p = [2,3,4,5,6,1]
    For k = 6 o/p = [1,2,3,4,5,6]
    For k = 7 o/p = [5,6,1,2,3,4]
    
    We can see that for k = 7 it gives the output same as for k = 1. So we can say that for k = 7, k = 6th rotation + 1. Similarly  for k = 15, k = 6 + 6 + 3.

    Here the n - 1 element will be the last one. So if we want to shift the last element to the right, it will be the 1st position.So for every right rotation:
    (i+k) is the place in the right for every array element.
    arr[(i+k) % n] = arr[i];
    
 */

import java.util.*;

class RotateArrayRight {

    public static void rotate(int[] nums, int k) {
        // initialize the variables n and k, where n is the size of the input vector
        // nums, and k is the number of positions to rotate.
        int n = nums.length;
        k = k % n;

        // k is 0, n is 0, or n is equal to k, we return early as no rotation is needed.
        if (k == 0 || n == 0 || n == k) {
            return;
        }

        // Initialise count, start, current and previous variables
        int count = 0;
        int start = 0;
        int current = start;
        int prev = nums[start];

        // We enter a loop that continues until all elements have been moved to their
        // correct positions. Inside the loop:
        // We calculate the new index current by adding k to the current index and
        // taking the modulus of n to handle wraparound.
        // We swap the value at the current index current with the value in prev.
        // We update prev to the value that was previously at the current index.
        // We increment the count.
        // If the current index becomes equal to the start index, it means that we have
        // completed a rotation cycle. We increment start, update current and prev to
        // the new values, and continue the rotation process until all elements have
        // been moved.
        while (count < n) {
            current = (current + k) % n;
            int temp = nums[current];
            nums[current] = prev;
            prev = temp;
            count++;

            if (current == start) {
                start++;
                current = start;
                prev = nums[start];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int k = 1;

        System.out.print(rotate(nums, k));
    }
}
