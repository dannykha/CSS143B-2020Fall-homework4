package Problem1;

import java.util.Stack;

// pringles can is stack, take off all the tops and then put them back in

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if(!stack.isEmpty()) { // SIMPLIFIED
            int x = stack.pop();
            reverseStack(stack);
            bottomStack(stack, x);
        }
    }
    public static void bottomStack(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) { // wait wot
            stack.push(x);
            return;
        }
        int y = stack.pop();
        bottomStack(stack, x);
        stack.push(y);
    }
}