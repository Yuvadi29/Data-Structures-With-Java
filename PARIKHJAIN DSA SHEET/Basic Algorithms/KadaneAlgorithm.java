/*We are given an arry of length n consisting of integers.
 * We have to find the sum of subarray including empty subarray having maximum sum among all subarrays.
 * A subarray is a contiguous segment of an array. 
 * For eg:
 * i/p: {1,2,7,-4,3,2,-10,9,1}
 * O/p: 11
 * The subarray yielding maximum sum is [1, 2, 7, -4, 3, 2].
 */

public class KadaneAlgorithm {

    public static long maxSubarraySum(int[] arr, int n){
        
        int sum = 0;
        int max  = 0;

        // BruteForce Approach
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
                
        //         sum = 0;
        //         for (int k = i; k < j; k++) {
        //             sum += arr[k];
        //         }
        //         max = Math.max(sum, max);
        //     }
        // }
        // return max;

        // Better Apporoach
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum +=arr[j];
            }
            max = Math.max(sum, max);
        }
        return max;

        
    }

    public static void main(String[] args) {
        int n = 9;
        int[] arr = {1,2,7,-4,3,2,-10,9,1};

        System.out.println(maxSubarraySum(arr, n));

    }

}
