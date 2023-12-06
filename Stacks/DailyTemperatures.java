import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        // Initialise the stack
        Stack<Integer> indexStack = new Stack<>();

        int n = temperatures.length;
        // Array to store the final output
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            // Pop all indices with a lower or equal temperature than current index
            while (!indexStack.isEmpty() && temperatures[i] >= temperatures[indexStack.peek()]) {
                indexStack.pop();
            }

            // If stack still has element, then next warmer temperature exists
            if (!indexStack.isEmpty()) {
                result[i] = indexStack.peek() - i;
            }

            // Insert current index in stack
            indexStack.push(i);
        }

        return result;
    }
}
