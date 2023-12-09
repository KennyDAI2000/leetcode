package Hash;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setNum1 = new HashSet<>();
        Set<Integer> setNum2 = new HashSet<>();
        for(int i: nums1){
            setNum1.add(i);
        }
        int length = 0;
        for(int i: nums2){
            if(setNum1.contains(i)){
                setNum2.add(i);
                length++;
            }
        }
        int[] intersection = new int[length];
        int index = 0;
        for(int i: setNum2){
            intersection[index++] = i;
        }
        return intersection;


    }
}





        /*
        int[] hashNums1 = new int[1000];
        int[] hashNums2 = new int[1000];
        for(int num1 : nums1){
            hashNums1[num1]++;
        }
        for(int num2 : nums2){
            hashNums2[num2]++;
        }
        int length = 0;
        int[] hash = new int[1000];
        for(int i=0; i<1000; i++){
            if (hashNums1[i]>0 &&hashNums2[i]>0){
                length++;
                hash[i]++;
            }
        }
        int[] result = new int[length];
        int i = 0;
        int j = 0;
        while(i<1000){
            if(hash[i]>0){
                result[j] = i;
                j++;
            }
            i++;

        }
        return result;
         */