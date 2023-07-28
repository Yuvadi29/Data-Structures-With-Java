/*Counting Sort Algorithm */

public class CountSort {

    public static int[] sort(int n, int arr[]) {
        // Find the maximum value in input array to determine new array of max value
        // length
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Initialize count array with size equal to max value
        int[] count = new int[max + 1];

        // Count occurances of each element in input array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Modify count array to store cumulative sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Create output array with same size as input array
        int[] output = new int[arr.length];

        // Build sorted array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        
        return output;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        CountSort countSort = new CountSort();
        int[] sortedArr = countSort.sort(arr.length, arr);

        // Print the sorted array
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

}
