package Stack_and_Queue;

import java.util.Stack;

public class RemoveDuplicate {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if(!stack.isEmpty()){
            char temp = stack.pop();
            if(temp == s.charAt(i)){
                continue;
            }else {
                stack.push(temp);
                stack.push(s.charAt(i));
            }
            }else stack.push(s.charAt(i));
        }

        char[] output = new char[stack.size()];
        for(int i = output.length-1; i>=0; i--){
            output[i] = stack.pop();
        }
        return new String(output);

    }
}
