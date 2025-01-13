package Stack;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Four");
        stack.push("Five");
        stack.push("six");
        stack.push(null);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(stack));
        System.out.println(stack.search("First"));
        System.out.println(stack.search("Five"));
        
    }
}
