/*We are given an integer array arr of size N and integer K.
 * We have to find the total number of subarrays of the array whose sum of elements is equal to k. Subarray is contiguous block of elements in the array.
 * For eg: N = 4
 * arr = [3,1,2,4]
 * K = 6
 * Subarrays  = [3,1,2] and [2,4]
 */


public class CountAllSubArray {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;

        while (right < arr.length && left < arr.length) {
            sum += arr[right];
            if (sum > s) {
                left++;
                if (left < arr.length) {
                    right = left;
                    sum = arr[right];
                }
            }
            if (sum == s) {
                count++;
            }
            right++;
        }

        return count;
    }

}
