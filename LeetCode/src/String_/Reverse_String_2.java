package String_;

import java.util.Arrays;

public class Reverse_String_2 {
    public String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        int curIndex = 0;
        while((s.length()-curIndex)>2*k){
            int left  = curIndex;
            int right = curIndex + k - 1;
            for(int i=0; i<k/2; i++){
                char temp = res[left];
                res[left] = res[right];
                res[right] = temp;
                left++;
                right--;
            }
            curIndex += 2*k;
        }

        if((s.length()-curIndex-1)<k){
            int left  = curIndex;
            int right = s.length()-1;
            for(int i=0; i<(s.length()-curIndex)/2; i++){
                char temp = res[left];
                res[left] = res[right];
                res[right] = temp;
                left++;
                right--;
            }
        }else {
            int left  = curIndex;
            int right = curIndex + k - 1;
            for(int i=0; i<k/2; i++){
                char temp = res[left];
                res[left] = res[right];
                res[right] = temp;
                left++;
                right--;
            }
        }

        return new String(res);
    }
}

