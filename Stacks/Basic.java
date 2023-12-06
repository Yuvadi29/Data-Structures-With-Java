/*Basic Implementation of stack */

import java.util.*;

// Creating Stack 
class MyStack {
    private List<Integer> data; // Store elements

    public MyStack() {
        data = new ArrayList<>();
    }

    // Insert elemennt into stack
    public void push(int x) {
        data.add(x);
    }

    // Check whether stack is empty or not
    public boolean isEmpty() {
        return data.isEmpty();
    }

    // Get top item of stack
    public int top() {
        return data.get(data.size() - 1);
    }

    // Delete element from stack
    public boolean pop() {
        // Check whether stack is empty or not
        if (isEmpty()) {
            return false;
        }
        data.remove(data.size() - 1);
        return true;
    }
}

public class Basic {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);

        for (int i = 0; i < 4; i++) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
    }
}
