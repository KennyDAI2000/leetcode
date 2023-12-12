package Hash;

import java.util.HashMap;
import java.util.Map;

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean res = true;
        int[] magazinArr = new int[26];
        for(int i=0; i<magazine.length(); i++){
            magazinArr[magazine.charAt(i)-'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(magazinArr[ransomNote.charAt(i)-'a']<=0){
                return false;
            }else {
                magazinArr[ransomNote.charAt(i)-'a']--;
            }
        }



        return res;
    }
}


        /*boolean res = true;
        char[] ransomNoteArr = ransomNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();
        Map<Character, Integer> magazinMap = new HashMap<>();
        for (char i : magazineArr){
            if(!magazinMap.containsKey(i)){
                magazinMap.put(i, 1);
            }
            else{
                magazinMap.put(i, magazinMap.get(i)+1);
            }
        }
        for (char i :ransomNoteArr){
            if(!magazinMap.containsKey(i)){
                return false;
            }
            if(magazinMap.get(i)>0){
                magazinMap.put(i, magazinMap.get(i)-1);
            }else {
                return false;
            }
        }

        return res;*/