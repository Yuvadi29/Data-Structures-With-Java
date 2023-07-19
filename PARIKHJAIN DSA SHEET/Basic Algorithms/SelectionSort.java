/*Selection Sort:
 * Find the minimum element of the unsorted part 
 * put that element at the beginning of the array
 */

public class SelectionSort {

    public static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minimumIndex = i; // Assume the first element of the unsorted part is the minimum

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int[] arr = { 29, 72, 98, 13, 87, 66, 52, 51, 36 };

        selectionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
