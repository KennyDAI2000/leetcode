package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum_2 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int j = 0; j < nums.length - 3; j++){
            if(j>0&& nums[j]==nums[j-1]) continue;
            if(target>0 && nums[j]>target){
                break;
            }
            for (int i = j+1; i < nums.length - 2; i ++){
                if(i>j+1 && nums[i]==nums[i-1]) continue;
                int left = i+1;
                int right = nums.length - 1;

                while(left<right){
                    long sum = (long)nums[j] + nums[i] + nums[left] + nums[right];
                    if(sum == target){
                        res.add(Arrays.asList(nums[j], nums[i], nums[left], nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    } else if (sum<target) {
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }

        return res;
    }
}
