/*We are given a list of N integers and a positive integer K.
 * We define a list 'CONCAT' of size N*K formed by concatenating ARR Ktimes. 
 * For eg: Arr = [0,1,2] and K = 3
 *         CONCAT = [0,1,2,0,1,2,0,1,2]
 * We have to find the maximum possible sum of any non-empty subarray of CONCAT
 * 
 * For eg; ARR = [1,3] and K = 3
 * CONCAT = [1,3,1,3,1,3]
 * Max possible sum = 12 = (1+3+1+3+1+3)
 * 
 * Maximum possible sum matlab is continous subarray hona chahiye
 * 
 * CONCAT:
 * Create a new array named Concat which has size n*K
 * Push Iterate through the list and push the elements in the concat array
 * Once the last element is being pushed, repeat from the first element till the size is completed or not.
 * 
 * Finding the sum:
 * Iterate through the CONCAT
 * find if arr(i + 1) !=0 
 * if it is, add them and store it in variable sum
 */

import java.util.ArrayList;

public class MaxSubSumafterKConcat {

    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int K) {
        // // Finding the sumofSubarray
        // int sumofSubarray = 0;
        // int maxSoFar = Integer.MIN_VALUE;

        // / Create a new arraylist Concat to store all the elements with n*K being the
        // size of the arraylist
        // ArrayList<Integer> Concat = new ArrayList<>(n * K);

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < arr.size(); j++) {
        // // Concatenating the array with the number of times it is told to concatenate
        // Concat.add(arr.get(j));
        // // Print all the Elements at index
        // System.out.println("Element " + arr.get(j) + " is Added");
        // }
        // }
        // System.out.println("Concatenated ArrayList is: " + Concat);

        if (arr == null || arr.isEmpty() || K == 0) {
            return 0;
        }

        long maxEndingHere = 0;
        long maxSoFar = Long.MIN_VALUE;

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < n; j++) {
                for (int num : arr) {
                    maxEndingHere = Math.max(maxEndingHere + num, num);
                    maxSoFar = Math.max(maxSoFar, maxEndingHere);
                }
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(1);
        int n = 3;
        int K = 3;

        System.out.println("ArrayList is: " + arr);

        System.out.println(maxSubSumKConcat(null, n, K));
    }

}
