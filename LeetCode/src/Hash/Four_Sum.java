package Hash;

import java.util.HashMap;
import java.util.Map;

public class Four_Sum {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> hash1 = new HashMap<>();
        //Map<Integer, Integer> hash2 = new HashMap<>();
        int count = 0;

        for (int i : nums1){
            for (int j: nums2){
                if(!hash1.containsKey(i+j)){
                    hash1.put((i+j), 1);
                }else{
                    hash1.put((i+j), hash1.get(i+j)+1);
                }
            }
        }

        for (int i : nums3){
            for (int j: nums4){
                if(hash1.containsKey(-(i+j))){
                    count += hash1.get(-(i+j));
                }
            }
        }






        return count;
    }
}


        /*Map<Integer, Integer> hash1 = new HashMap<>();
        Map<Integer, Integer> hash2 = new HashMap<>();
        int count = 0;
        int hash1Count = 0;
        int hash2Count = 0;
        for (int j : nums1) {
            for (int k : nums2) {
                hash1.put(hash1Count, j + k);
                hash1Count++;
            }
        }

        for (int j : nums3) {
            for (int k : nums4) {
                hash2.put(hash2Count, j + k);
                hash2Count++;
            }
        }

        for(int i = 0; i<=hash1Count; i++){
            for(int j = 0; j<=hash2Count; j++){
                if((hash1.get(i)+hash2.get(j))==0){
                    count++;
                }
            }
        }


        return count;*/