package Arrary;//https://leetcode.cn/problems/remove-element/description/
import org.junit.Test;


public class Remove_Element {
    //TODO 快慢指针，快指针负责遍历数组，慢指针负责指向覆盖后的数组
    @Test
    public void test(){
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast<nums.length; fast++){
            if (nums[fast]!=val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }



}
