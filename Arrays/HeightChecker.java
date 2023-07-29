/*We have a line of students in ascending order according to their heights. And we are given an array (heights) representing current order of students. We have to return the number of indices where heights[i] != expected[i]
Approach:
sort the height and store in another variable
iterate through the height
if current heights[i] != expected[i]
    return heights[i]
    expected++;

For eg: heights = [1,1,4,2,1,3]
        O/P = 3
        Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.

  */

import java.util.*;

class HeightChecker {

    public static int heightChecker(int[] heights) {

        // Make a copy of height array using copyOf
        int[] expected = Arrays.copyOf(heights, heights.length);
        // Sort the array
        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};

        System.out.println(heightChecker(heights));
    }
}