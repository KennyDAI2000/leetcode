package Binary_Tree;

public class MaxBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traversal(nums);
    }

    public TreeNode traversal(int[] nums){
        if(nums.length==0) return null;
        int idx = 0;
        int nodeVal = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]>nodeVal){
                idx = i;
                nodeVal = nums[i];
            }
        }

        TreeNode node = new TreeNode(nodeVal);
        int[] left = new int[idx];
        int[] right = new int[nums.length-idx-1];
        System.arraycopy(nums, 0, left, 0, left.length);
        System.arraycopy(nums, idx+1, right, 0, right.length);

        node.left = traversal(left);
        node.right = traversal(right);

        return node;
    }
}
