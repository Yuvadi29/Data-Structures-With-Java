/*Insertion Sort:
 * Sorting Algorithm. Here a sublist is maintained. An element to be inserted in sorted sub-list has to find its appropriate place and insert it there. Array is then searched sequentially and unsorted items are mobed and inserted in the sorted array.
 * We have to sort it using inplace Operation
 */

public class InsertionSort {
    public static void insertionSort(int n, int[] arr) {

        int temp;
        for (int i = 0; i < n ; i++) {
            temp = arr[i];
            int j = i -1;

            while(j>=0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 6, 5, 4, 2 };

        insertionSort(n, arr);
        
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
