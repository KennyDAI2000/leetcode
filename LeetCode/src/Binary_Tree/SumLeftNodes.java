package Binary_Tree;

public class SumLeftNodes {
    public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        findSum(root, true);
        return sum;
    }
    public void findSum(TreeNode node, Boolean isLeftParent){
        if(node==null) return;
        if(node.left==null&&node.right==null&&isLeftParent){
            sum+=node.val;
        }

        findSum(node.left, true);
        findSum(node.right, false);

    }
}
