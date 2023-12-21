package Stack_and_Queue;

import java.util.Deque;
import java.util.LinkedList;


//1 3 -1 -3 5 3 4 1
public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] ints = new int[]{1,3,-1,-3,5,3,6,7};
        maxSlidingWindow(ints, 3);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> que = new LinkedList<>();
        int[] res = new int[nums.length-k+1];
        for(int i=0; i<k-1; i++){
            push(nums[i], que);
        }

        for(int i=0; i<res.length; i++){
            push(nums[i+k-1], que);
            pop(nums[i], que);
            res[i] = getMax(que);
        }

        return res;

    }


    public static void pop(int val, Deque<Integer> que){
        if((!que.isEmpty())&&(val==que.getFirst())){
            que.pop();
        }
    }

    public static void push(int val, Deque<Integer> que){
        if((!que.isEmpty())&&(val>que.getFirst())){
            while(!que.isEmpty()){
                que.pop();
            }
        }else if (!que.isEmpty()){
            while(val>que.getLast()) que.pollLast();
        }
        que.add(val);
    }

    public static int getMax(Deque<Integer> que){
        return que.getFirst();
    }


}
