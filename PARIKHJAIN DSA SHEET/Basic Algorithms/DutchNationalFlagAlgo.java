/*We are given an integer array of size N containing 0s and 1s. We have to sort this array
 * For eg: 0 1 2 2 1 0
 * O/p: 0 0 1 1 2 2
 * We have to try to solve it using Single Scan which means iterating over the array just once.
*/

public class DutchNationalFlagAlgo {

    public static void sort012(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int i = 0;

        while (i <= high) {
            if (arr[i] == 0) {
                swap(arr, i, low);
                low++;
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, high);
                high--;
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 1, 0 };

        sort012(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
