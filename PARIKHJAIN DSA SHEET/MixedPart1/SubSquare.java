import java.util.*;
import java.io.*;
import java.util.ArrayList;


public class SubSquare {

    public static ArrayList<ArrayList<Integer>> sumOfKxKMatrices(ArrayList<ArrayList<Integer>> arr, int k) {
        int n = arr.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        // iterate over all possible submatrices of size k x k
        for (int i = 0; i <= n - k; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= n - k; j++) {
                int sum = 0;
                // calculate sum of current submatrix
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        sum += arr.get(x).get(y);
                    }
                }
                row.add(sum);
            }
            ans.add(row);
        }
        return ans;
}

}
