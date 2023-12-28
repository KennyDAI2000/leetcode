package Binary_Tree;

public class ValidateBST {
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        return Validation(root);
    }

    public boolean Validation(TreeNode node){
        if(node==null) return true;
        boolean left = Validation(node.left);
        if(pre!=null&&pre.val>node.val) return false;
        pre = node;

        boolean right = Validation(node.right);
        return left&&right;
    }

}
