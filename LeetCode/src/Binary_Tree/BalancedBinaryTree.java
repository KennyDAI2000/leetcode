package Binary_Tree;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return countDif(root)!=-1;
    }

    public int countDif(TreeNode node){
        if(node==null) return 0;

        TreeNode left = node.left;
        TreeNode right = node.right;

        int leftDif = countDif(node.left);
        if(leftDif==-1) return -1;
        int rightDif = countDif(node.right);
        if(rightDif==-1) return -1;

        if(Math.abs(leftDif-rightDif)>1){
            return -1;
        }else {
            return 1+Math.max(leftDif,rightDif);
        }

    }
}
