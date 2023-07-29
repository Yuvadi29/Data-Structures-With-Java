import java.util.Arrays;

// We are given 2 integer array sorted in ascending order and 2 integers representing the number of elements in that array
// We have to merge the array and put them in ascending order.

class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n, int[] nums3) {
        int i = m - 1; // Pointing to last element of array of nums1
        int j = n - 1; // Pointing to last element of array of nums2
        int k = (m + n - 1);


        // Comparing the last 2 elements of both the arrays and seeing if they are greater than each other, if yes then we add it as the last element of the result array
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                // Here we first equate nums1[k] = nums1[i] and then decrement the values
                nums1[k--] = nums1[i--];
            } else {
                // Here we first equate nums1[k] = nums2[j] and then decrement the values
                nums1[k--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }

}
