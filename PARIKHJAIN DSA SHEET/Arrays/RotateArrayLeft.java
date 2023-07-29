/*We are given an array of N elements. We have to rotate the array by k steps to the left.
 For e.g. [1,2,3,4,5,6] with k=2
    o/p: [3,4,5,6,1,2]
    Approach:
    For k = 1 o/p = [2,3,4,5,6,1]
    For k = 2 o/p = [3,4,5,6,1,2]
    For k = 3 o/p = [4,5,6,1,2,3]
    For k = 4 o/p = [5,6,1,2,3,4]
    For k = 5 o/p = [6,1,2,3,4,5]
    For k = 6 o/p = [1,2,3,4,5,6]
    For k = 7 o/p = [2,3,4,5,6,1]
    
    We can see that for k = 7 it gives the output same as for k = 1. So we can say that for k = 7, k = 6th rotation + 1. Similarly  for k = 15, k = 6 + 6 + 3.

    What we can do is that firstly store the number of elements to be rotated in a temp array. And then start shifting from the kth element to the left and then change the temp array value
 */


import java.util.*;

class RotateArrayLeft {

    void leftRotate(int arr[], int n, int k) {
        // As we will get the array in the form of kth rotation + n;
        k = k % n;

        // Storing d elements in temp[] array
        int[] temp = new int[k];

        // Iterating through the array to store them
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Starting to shift array from kth index to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        RotateArrayLeft solution = new RotateArrayLeft();
        solution.leftRotate(arr, n, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
