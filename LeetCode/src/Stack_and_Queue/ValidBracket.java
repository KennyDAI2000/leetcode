package Stack_and_Queue;

import java.util.Arrays;
import java.util.Stack;

public class ValidBracket {
    public static void main(String[] args) {
        isValid("()");
    }
    public static boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        char[] input = s.toCharArray();
        System.out.println("input"+ Arrays.toString(input));
        for(char i : input){
            if(i=='('||i=='{'||i=='['){
                bracket.push(i);
            }else {
                char match = bracket.pop();

                if(matchBracket(i)!=match){
                    return false;
                }
            }
            System.out.println("c:"+bracket+" ");
        }
        return bracket.isEmpty();
    }

    public static char matchBracket(Character c){
        if(c==')'){
            return '(';
        } else if (c==']') {
            return '[';
        } else if (c=='}') {
            return '{';
        }

        return ' ';
    }
}
