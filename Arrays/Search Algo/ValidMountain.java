// Mountain Array is a kind of an array where the numbers increase to a certain value and from there decrease but they should not be repeated one after the other.
// For eg. [0,2,3,4,5,2,1,0] is a valid one and [0,2,3,3,4,5,2,1,0] is not as 3 is repeated here.
// Approach would be:
/* 
Checking if array  length is >=3 {
    Iterating from 0 to N-1 index {
        see if neighbours are not same {
            increase hoke decrease ho raha hai agar {            
                return true;
            } 
            return false;
        }
return false;
    }
}
return false
*/

class ValidMountain {

    public static boolean validMountainArray(int[] arr) {
        // Given condition that it will only work if the length of array is greater than
        // equal to 3. So if it is >= 3, then only it will enter the loop for iteration.
        if (arr.length < 3) {
            return false;
        }

        int i = 0;

        // Check to see if the elements are in decreasing order or not
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Check to see if the center of the mountain is not at the start or end of the
        // array
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        // Check to see if the elements are in increasing order or not
        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 2, 1 };

        System.out.println(validMountainArray(arr));
    }
}
