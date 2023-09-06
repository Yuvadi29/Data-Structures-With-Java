/*We are given an array of N distinct intgers.
 * We have to find product P with highest count C of quadraples which follow p*q=r*s where p q r and s are integers at different indexes.
 * 
 * For eg: 2 6 3 4 1 12
 * There are 3(C) quadruples for product (P) 12 which are:
 * 2 6 and 3 4
 * 2 6 and 1 12
 * 3 4 and 1 12
 * 
 */

import java.util.*;
import java.io.*;

public class MaxProductCount {

    public static long[] maxProductCount(int arr[], int n) {
        // To store the product of two numbers as Key and value as the total number of
        // occurrences.
        HashMap<Long, Integer> map = new HashMap<>();

        // To find all pair products and store them in a HashMap with their frequencies.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long a = arr[i];
                long b = arr[j];
                long pairProduct = a * b;
                map.putIfAbsent(pairProduct, 0);
                map.put(pairProduct, map.get(pairProduct) + 1);
            }
        }

        // To store the max product pair.
        long maxProd = 0;

        // To store the frequency of the max product.
        int freq = 0;

        // Traverse the HashMap.
        for (Long prod : map.keySet()) {
            if (map.get(prod) >= freq) {
                // If frequency is the same as the previous max frequency, then choose the one
                // with the minimum product.
                if (map.get(prod) == freq) {
                    maxProd = Math.min(maxProd, prod);
                } else {
                    maxProd = prod;
                }
                freq = map.get(prod);
            }
        }

        // Array to store the values of the max product and Quadruples.
        long[] result = new long[2];

        // If there is no pair having a frequency count > 1.
        if (map.get(maxProd) == null || map.get(maxProd) == 1) {
            // Returning the array containing max product and the number of Quadruples.
            result[0] = 0;
            result[1] = 0;
            return result;
        }

        // Calculating the total Quadruples as all combinations a pair can have with the
        // given frequency.
        long allCombinations = ((freq * (freq - 1))) / 2;
        result[0] = maxProd;
        result[1] = allCombinations;
        // Returning the array containing max product and the number of Quadruples.
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 4, 1, 12 };
        int n = 6;

        System.out.println(maxProductCount(arr, n));
    }

}
