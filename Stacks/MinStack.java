/*Design a stack that supports push, pop, top and retriveing minimum element in constat time
 * MinStact() initiliases a stack object
 * void push(int val) pushes element val into stack
 * void pop() removes element at top of stack
 * int top() gets top element of the stack
 * int getMin() gets minimum element in stack
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        dataStack.push(val);

        // Check if minstack is empty or new element is less than current
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!dataStack.isEmpty()) {
            int popped = dataStack.pop();

            if (popped == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (!dataStack.isEmpty()) {
            return dataStack.peek();
        }
        // Throw an exception if the stack is empty
        throw new RuntimeException("Stack is empty");
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        // Throw an exception if the stack is empty
        throw new RuntimeException("Stack is empty");
    }
}
