/*We are given a binary matrix with dimensions N*M. We need to find and return sum of coverages of all zeroes of a given matrix. Coverage of a particular 0 is defined as total number of 1s around it i.e Up down left right 
 * 
 * ArrayList class uses dynamic array for storing elements. Here there is no size limit. 
 * 
 * Approach:
 * Iterate through the row with i and columns with j
 * Intialise count to 0
 * if(arr[i] || arr[j] == 0 && arr[i+1] == 1 || arr[j+1] == 1 || arr[i-1] == 1 || arr[j-1] == 1){
 * count++
 * }
 * return count;
*/

import java.util.*;

public class SumofZeroes {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
		// initialse count of row and column and sumofCoverages
		int rowCount = mat.size();
		int colCount = mat.get(0).size();
		int sumOfCoverages = 0;

		// Iterate the matrix
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				// Check if the current element is 0
				if (mat.get(i).get(j) == 0) {
					int count = 0;

					// Checking if the neighboruing elements are one
					// Top
					if (i - 1 >= 0 && mat.get(i - 1).get(j) == 1) {
						count++;
					}
					if (i + 1 < rowCount && mat.get(i + 1).get(j) == 1) {
						count++;
					}
					if (j - 1 >= 0 && mat.get(i).get(j - 1) == 1) {
						count++;
					}
					if (j + 1 < colCount && mat.get(i).get(j + 1) == 1) {
						count++;
					}

					// Add the coverage count to the sum
					sumOfCoverages += count;
				}
			}
		}
		return sumOfCoverages;
	}
}
