/*We arew given 2 arrays A and B of size N and M. They are sorted. We have to find the intersection of these arrays.
 * Intersection is an array that consists all the common elements in both arrays
 * For eg: I/p: A: {1,2,2,2,3,4}
 *              B: {2,2,3,3}
 * O/P: {1,2,3}
 * 
 * 
 */

import java.util.ArrayList;

public class IntersectionArray {

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
            int m) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int i = 0; // Pointer for first array
        int j = 0; // Pointer for second array

        // traverse array while there are elements in both of them
        while (i < n && j < m) {
            int num1 = arr1.get(i);
            int num2 = arr2.get(j);

            if (num1 == num2) {
                intersection.add(num1);
                // Move both pointer forward
                i++;
                j++;
            } else if (num1 < num2) {
                // If the element in the first array is smaller, move its pointer forward
                i++;
            } else {
                // If the element in the second array is smaller, move its pointer forward
                j++;
            }
        }

        return intersection;
    }

}
