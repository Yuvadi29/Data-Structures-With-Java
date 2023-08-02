/*We are given a circular array of N integers. We have to find out the maximum possible of a non-empty subarray. A subarray may only include each element once
 * For eg: i/p: -2 -3 -1
 * o/p: -1 => Here we see that the subarray will have the maximum sum as -1
 */

public class MaxSumCircularArray {

    public static int maxSubarraySum(int[] arr, int n) {

        // Corner case
        if (n == 1) {
            return arr[0];
        }

        // Initialise sum variable storing the sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Initialise every variable with first value
        int currMax = arr[0], max = arr[0], currMin = arr[0], min = arr[0];

        // Using Kadane's Algorithm
        for (int i = 1; i < n; i++) {
            // findMax Subarray sum
            currMax = Math.max(currMax + arr[i], arr[i]);
            max = Math.max(max, currMax);

            // findMin Subarray sum
            currMin = Math.min(currMin + arr[i], arr[i]);
            min = Math.min(min, currMin);
        }

        if (min == sum) {
            return max;
        }

        return Math.max(max, sum - min);

    }

    public static void main(String[] args) {
        int[] arr = { -3, -2, -1 };
        int n = 3;

        System.out.println(maxSubarraySum(arr, n));
    }
}
