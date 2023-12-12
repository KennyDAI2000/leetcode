package String_;

public class Reverse_String {
    public void reverseString(char[] s) {
        int cycle = s.length / 2;
        int left = 0;
        int right = s.length - 1;
        for(int i=0; i<cycle; i++){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
