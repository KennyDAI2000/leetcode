package Stack;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        emptyStack();
        return stackOut.pop();
    }

    public int peek() {
        emptyStack();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    public void emptyStack(){
        if (!stackOut.isEmpty()) return;
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}
