package Binary_Tree;

public class CommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return Travel(root, p, q);
    }

    public TreeNode Travel(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) return null;
        if(node==p||node==q) return node;

        TreeNode left = Travel(node.left, p, q);
        TreeNode right = Travel(node.right, p, q);

        if(left!=null&&right!=null){
            return node;
        }

        if(left==null&&right!=null){
            return right;
        }

        if(right==null&&left!=null){
            return left;
        }

        return null;
    }
}
