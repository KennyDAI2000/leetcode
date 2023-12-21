package Stack_and_Queue;

import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> eval = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                eval.push(eval.pop()+eval.pop());
            } else if (s.equals("-")) {
                int temp = eval.pop();
                eval.push(eval.pop()-temp);
            } else if (s.equals("*")) {
                eval.push(eval.pop()*eval.pop());
            } else if (s.equals("/")) {
                int temp = eval.pop();
                eval.push(eval.pop()/temp);
            }else {
                eval.push(Integer.parseInt(s));
            }
        }

        return eval.pop();
    }
}
