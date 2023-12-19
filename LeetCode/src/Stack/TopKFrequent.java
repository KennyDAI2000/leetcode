package Stack;

import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        PriorityQueue<int[]> kFrequency = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[1]-o2[1]);
            }
        });


        int[] res = new int[k];
        for (int i:nums){
                hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if(kFrequency.size()<k){
                kFrequency.add(new int[]{entry.getKey(), entry.getValue()});
            }else if(entry.getValue()>kFrequency.peek()[1]){
                kFrequency.add(new int[]{entry.getKey(), entry.getValue()});
                kFrequency.poll();
            }
        }

        for(int i=0; i<k; i++){
            res[i] = kFrequency.poll()[0];
        }

        return res;
    }

}
