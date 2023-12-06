/*We are given string containing characters '(', ")", "{", "}", "[","]".
Determine if it is valid:
    -> Opening bracket must be closed by same type of brackets
    -> Open bracket must be closed in correct order
    -> Every closed bracket has a correspoding open bracket of same type
 * 
 */

import java.util.Stack;

public class ValidParenthesis {

    private Stack<Character> parensStack = new Stack<>();

    public boolean isValid(String s) {

        if (s.isEmpty()) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {

            // Get current character
            char currentCharacter = s.charAt(i);

            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
                parensStack.push(currentCharacter);
            } else if (currentCharacter == ')' || currentCharacter == ']' || currentCharacter == '}') {
                // Check if stack is non empty   
                if(!parensStack.isEmpty()){
                    return false;
                } 

                char openBracket = parensStack.pop();
                if(!isValidPair(openBracket, currentCharacter)){
                    return false;
                }
            }
        }

        return parensStack.isEmpty();
    }

    private boolean isValidPair(char open, char close){
        return (open == '(' && close == ')' || open == '[' && close == ']' || open == '{' && close == '}');
    }
}
