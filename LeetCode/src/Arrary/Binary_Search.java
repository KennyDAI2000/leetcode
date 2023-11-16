package Arrary;
//https://leetcode.cn/problems/binary-search/description/
//import org.junit.Test;

public class Binary_Search {
    //@Test
    public void Test(){
        int[] nums = {2, 5, 8, 12};
        int target = 2;
        System.out.println(search(nums, target));
    }


    /*public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }*/

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left<=right){
            // TODO 防止溢出
            int middle = left+ (right-left)/2;
            if (target<nums[middle]){
                right = middle-1;
            }else if (target > nums[middle]){
                left = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }


}
