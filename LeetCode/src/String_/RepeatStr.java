package String_;

public class RepeatStr {
    public boolean repeatedSubstringPattern(String s) {
        String doubleS = s+s;
        return doubleS.substring(1,doubleS.length()-1).contains(s);
    }
}
