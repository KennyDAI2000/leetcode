package String_;

public class First_Index_First_Str {
    public int strStr(String haystack, String needle) {
        int index = -1;
        for(int i=0; i<haystack.length() - needle.length(); i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String posRes = haystack.substring(i, i+needle.length());
                if(posRes.equals(needle)){
                    index = i;
                    return index;
                }
            }
        }

        return index;
    }
}
