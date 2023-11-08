//https://leetcode.cn/problems/squares-of-a-sorted-array/description/
import org.junit.Test;

import java.util.Arrays;

public class Sqaures_Of_A_Sorted_Array {
    //TODO 双指针，因为最大的平方数一定在两侧产生
    @Test
    public void test(){
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public int[] sortedSquares(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int k = nums.length - 1;
        for (int i=0, j=nums.length-1; i<=j; ){
            if (nums[i]*nums[i] > nums[j] * nums[j]){
                sortedArray[k] = nums[i] * nums[i];
                k--;
                i++;
            }else{
                sortedArray[k] = nums[j] * nums[j];
                k--;
                j--;
            }
        }

        return sortedArray;
    }
}
