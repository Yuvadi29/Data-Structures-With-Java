/*We are given 2 strings STR1 and STR2. Our taks is to find if STR1 is a subsequence of STR2. A subsequence is a new string that can be derived from the original string by deleting some characters without changing the relative order of the string
 * For eg: "ADI" is the subsequnce of "ADITYA"
 * 
 * Approach:
 * Convert both string to charArray
 * if present, add it into the strArray 
 *  
 */
public class isSubsequence {

    public static String isSubsequence(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        int i = 0;
        int j = 0;

        StringBuilder subseq = new StringBuilder();

        while (i < charArray1.length && j < charArray2.length) {
            if (charArray1[i] == charArray2[j]) {
                subseq.append(charArray1[i]);
                i++;
            }
            j++;
        }

        if (i == charArray1.length) {
            return subseq.toString();
        } else {
            return ""; // Empty string if str1 is not a subsequence of str2
        }
    }

    public static void main(String[] args) {
        String str1 = "ADI";
        String str2 = "ADITYA";

        System.out.println(isSubsequence(str1, str2));
    }

}
