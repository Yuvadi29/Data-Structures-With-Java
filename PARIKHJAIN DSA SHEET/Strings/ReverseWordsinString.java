/* Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Approach:
Take a String array and initialise it to null
Take a String output and initialise it to null
Split the array by " "
Iterate the reverse array 
Iterate the strings and make them reverse
add them in revArray 
*/

public class ReverseWordsinString {

    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse()).append(" ");
        }

        return result.toString().trim();

    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
