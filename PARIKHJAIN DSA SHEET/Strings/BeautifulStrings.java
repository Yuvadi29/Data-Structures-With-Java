/*We are given a binary string. It contains either 0 or 1. It is beautiful if it has alternating 0 and 1. For eg: 1010 is a beautiful string.
 * 
 * Approach:
 * Beautiful if alternating 1 and 0 hai = 1010
Approach:
Iterate through the String length
variable count to count operation
agar ith index wala 0 or 1 hai aur uske aage wala 
same aa raha hai toh ith wale ko change karo to 1 or 0
and then increment count value
agar ith index aur i+1th index wala differnt hai toh 
continue karo.



 */

public class BeautifulStrings {

    public static int makeBeautiful(String str) {

        // Count variable to keep a track of the number of operations needed
        int count = 0;
        char[] chars = str.toCharArray();

        if (chars.length <= 1) {
            return count; // Empty or single character string, no operations needed
        }

         for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                // Change the character to the opposite value
                chars[i + 1] = (chars[i + 1] == '0') ? '1' : '0';
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "0000";
        System.out.println(makeBeautiful(str));
    }
}
