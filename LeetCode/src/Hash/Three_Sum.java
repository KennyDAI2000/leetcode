package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //HashSet<List<Integer>> listHashSet = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1;
            int right = nums.length -1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    ArrayList<Integer> curRes = new ArrayList<>();
                    curRes.add(nums[i]);
                    curRes.add(nums[left]);
                    curRes.add(nums[right]);
                    res.add(curRes);
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                } else if (sum>0) {
                    right--;
                }
            }
        }

        return res;
    }
}


            /*if(initSum>=0){
                while(initSum >= 0 && right>left){
                    if(initSum==0){
                        ArrayList<Integer> curRes = new ArrayList<>();
                        curRes.add(nums[i]);
                        curRes.add(nums[left]);
                        curRes.add(nums[right]);
                        if(!listHashSet.contains(curRes)){
                            res.add(curRes);
                            listHashSet.add(curRes);
                        }
                    }
                    right --;
                    initSum = nums[i] + nums[left] + nums[right];
                }
            }else {
                while(initSum<=0 && right>left){
                    if(initSum==0){
                        ArrayList<Integer> curRes = new ArrayList<>();
                        curRes.add(nums[i]);
                        curRes.add(nums[left]);
                        curRes.add(nums[right]);
                        if(!listHashSet.contains(curRes)){
                            res.add(curRes);
                            listHashSet.add(curRes);
                        }
                    }
                    left ++;
                    initSum = nums[i] + nums[left] + nums[right];
                }
            }*/