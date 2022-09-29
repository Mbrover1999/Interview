import java.util.Stack;

public class QueUsingSet {
    private Stack<Integer> stack;
    private Stack<Integer> reversedStack;


    public QueUsingSet() {
        this.stack = new Stack<>();
        this.reversedStack = new Stack<>();

    }

    public void push(int value) {
        if (stack.size() == 0) {
            this.stack.push(value);
        } else {
            while (!stack.empty()) {
                reversedStack.push(stack.pop());
            }
            reversedStack.push(value);
            while (!reversedStack.empty()) {
                stack.push(reversedStack.pop());
            }
        }

    }


    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();

    }

    public int size() {
        return stack.size();
    }


}
