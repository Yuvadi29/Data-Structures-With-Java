/*We are given an array of strings `tokens` that represents an arithmatic expression in a Reverse Polish Notation. A Reverse Polish Notation is a Postfix Notation where the operator follows the operands. For example, 34+ is a Reverse Polish Notation and 3+4 is not. We have to return and integer that represents the value of the expression.
 * => Initialise a stack
 * => Iterate through the array 
 * => If the element is a number, push into the stack
 * => If element is an operator, pop all elements from the stack
 * Put the operator, with the values as arguments and form a string. 
 * Push the resulted string back to stack. 
 * If there is only one value in the stack 
 * That value in the stack is the desired infix string. 
 */

import java.util.Stack;

public class ReversePolishNotation {

    static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperand(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int oper2 = stack.pop();
                int oper1 = stack.pop();
                int result = evaluateExpression(oper1, oper2, token);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private boolean isOperand(String x) {
        try {
            Integer.parseInt(x);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int evaluateExpression(int oper1, int oper2, String operator) {
        switch (operator) {
            case "+":
                return oper1 + oper2;
            case "-":
                return oper1 - oper2;
            case "*":
                return oper1 * oper2;
            case "/":
                return oper1 / oper2;
            default:
                throw new IllegalArgumentException("Invalid Operator: " + operator);

        }
    }

}
