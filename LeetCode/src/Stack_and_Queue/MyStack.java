package Stack_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> myQueue;
    public MyStack() {
        myQueue = new LinkedList<>();
    }

    public void push(int x) {
        myQueue.add(x);
    }

    public int pop() {
        reverse();
        return myQueue.poll();
    }

    public int top() {
        reverse();
        int topElement = myQueue.peek();
        reverse();
        return topElement;
    }

    public boolean empty() {
        return myQueue.isEmpty();
    }

    public void reverse(){
        int size = myQueue.size();
        while (size!=1){
            myQueue.add(myQueue.poll());
            size--;
        }
    }
}
