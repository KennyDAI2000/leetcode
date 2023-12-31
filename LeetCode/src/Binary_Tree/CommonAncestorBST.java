package Binary_Tree;

public class CommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        while (node!=null){
            if(p.val<node.val&&q.val<node.val){
                node = node.left;
            }
            if(p.val>node.val&&q.val>node.val){
                node = node.right;
            }
        }

        return node;
    }
}
