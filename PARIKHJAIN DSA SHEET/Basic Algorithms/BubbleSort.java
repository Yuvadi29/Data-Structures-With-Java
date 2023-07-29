/*Bubble Sort
 * Divide and Conquor Algorithm
 * Works by repeatedly swapping adjacent elements of array if they  are not in sorted order
 */

public class BubbleSort {

    public static void bubbleSort(int[] arr, int n) {
        // Iterating the entire array
        for (int i = 0; i < n - 1; i++) {

            // Swapping the elements based on the comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 5, 7, 11, 3, 18, 1 };

        bubbleSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
