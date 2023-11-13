package Arrary;// https://leetcode.cn/problems/minimum-size-subarray-sum/description/
import org.junit.Test;
import java.math.*;
public class Min_Size_Sub_Array {
    public static void main(String[] args) {
        int target = 15;
        int[] nums = {5,1,3,5,10,7,4,9,2,8};
        System.out.println(minSubArrayLen(target, nums));
    }
    @Test
    public void Test(){
        int target = 15;
        int[] nums = {5,1,3,5,10,7,4,9,2,8};
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;
        for (int j=0; j<nums.length; j ++){
           sum += nums[j];
            while (sum >= target){
               sum -= nums[i];
                i++;
               length = Math.min(length,j-i+2);
           }
        }
        return length==Integer.MAX_VALUE? 0: length;

    }
}
