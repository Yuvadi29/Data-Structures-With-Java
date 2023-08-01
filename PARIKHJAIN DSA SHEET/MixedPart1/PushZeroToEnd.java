/*We are given an array list of numbers, we have to find the Zeroes and put them in the end of the List */

import java.util.ArrayList;

class PushZeroToEnd {
    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
        int writePointer = 0;

        // If the current element is not 0, we need to append it in front of the last
        // non-0 element found
        for (int readPointer = 0; readPointer < arr.size(); readPointer++) {
            if (arr.get(readPointer) != 0) {
                arr.set(writePointer, arr.get(readPointer));
                writePointer++;
            }
        }

        // After processing is finished, all non-zero elements are in the beginning.
        // We fill the remaining array with 0
        while (writePointer < arr.size()) {
            arr.set(writePointer, 0);
            writePointer++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(0);
        arr.add(5);
        arr.add(8);
        arr.add(0);
        arr.add(10);

        System.out.println("Before pushing zeroes to the end: " + arr);

        pushZerosAtEnd(arr);

        System.out.println("After pushing zeroes to the end: " + arr);
    }
}
