import java.util.*;
import java.io.*;

public class NthElemSpiral {
    

    public static int findKthElement(int[][] matrix, int k) {
        // Write your code here.

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int down = n - 1;
        int left = 0;
        int right = m - 1;
        int dir = 0;
        int ans = 0;
        int count = 0;

        while (top <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                count++;
                if (count == k) {
                    return matrix[top][i];
                }
            }
            top++;
            for (int i = top; i <= down; i++) {
                count++;
                if (count == k) {
                    return matrix[i][right];
                }
            }
            right--;

            if (top <= down) {
                for (int i = right; i >= left; i--) {
                    count++;
                    if (count == k) {
                        return matrix[down][i];
                    }
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    count++;
                    if (count == k) {
                        return matrix[i][left];
                    }

                }
                left++;
            }

        }
        return ans;
}

}
