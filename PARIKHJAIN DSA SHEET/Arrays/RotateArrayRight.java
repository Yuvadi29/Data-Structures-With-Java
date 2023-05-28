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

    

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int k = 1;

        System.out.print(rotate(nums, k));
    }
}
