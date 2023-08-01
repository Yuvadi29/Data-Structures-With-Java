
/* We need to find the kTh character of the decrypted string.
For eg: Ip:a2b3cd3
    Find the 8th character:
    This input will be decrypted as: aabbbcdcdcd
    The character will be then c

    Approach:
    Take the input
    Convert the input into the Decrypted value:
        Identify the character pair till we get the number
        Convert the string to character arry
        Iterate the array and then decrypt the values where you repeat the character the times with which it is represented
        
    Iterate again and find out the kth character which will point to the k-1 index

*/
import java.util.*;

import java.util.*;

class KCharacterDecrypt {

    public static char kThCharaterOfDecryptedString(String s, long k) {
        StringBuilder decryptedString = new StringBuilder();
        int num = 0;
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + Character.getNumericValue(ch);
            } else {
                if (num == 0) {
                    num = 1; // If there is no number after the character, assume it is repeated once.
                }
                for (int j = 0; j < num; j++) {
                    decryptedString.append(ch);
                }
                num = 0; // Reset the count for the next character.
            }
            i++;
        }

        if (k <= decryptedString.length()) {
            return decryptedString.charAt((int) (k - 1));
        } else {
            throw new IllegalArgumentException("k is greater than the length of the decrypted string.");
        }
    }

    public static void main(String[] args) {
        String s = "a2b3cd3";
        long k = 4;

        System.out.println(kThCharaterOfDecryptedString(s, k)); // Output: c
    }
}
