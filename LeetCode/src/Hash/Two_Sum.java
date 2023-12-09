package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsHashed = new HashMap<>();
        for(int i=0; i <nums.length; i++) {

            if (numsHashed.containsKey(target - nums[i])){
                return new int[]{numsHashed.get(target - nums[i]), i};
            }
            numsHashed.put(nums[i], i);
        }
        return new int[]{};

    }
}
