/*We are given an array nums. We have to move all even integers at beginning and odd integers at end.
 * For eg: [3,1,2,4]
 *   O/P: [2,4,3,1]
 * 
 */

public class SortByParity {

    class Solution {
        public int[] sortArrayByParity(int[] A) {
            int i = 0, j = A.length - 1;
            while (i < j) {
                if (A[i] % 2 > A[j] % 2) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }

                if (A[i] % 2 == 0)
                    i++;
                if (A[j] % 2 == 1)
                    j--;
            }

            return A;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };

        System.out.println(sortArrayByParity(nums));
    }
}
