package Binary_Tree;

public class InsertBST {
    /**
     * public TreeNode insertIntoBST(TreeNode root, int val) {
     *         if (root == null) return new TreeNode(val);
     *         TreeNode cur = root;
     *         TreeNode parent = root;
     *         TreeNode node = new TreeNode(val);
     *         while(cur!=null){
     *             parent = cur;
     *             if(cur.val>val){
     *                 cur = cur.left;
     *             }else if(cur.val<val) {
     *                 cur = cur.right;
     *             }
     *         }
     *
     *         if(parent.val>val) parent.left = node;
     *         if(parent.val<val) parent.right = node;
     *         return root;
     *     }
     *     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root, val);
    }

    public TreeNode insert(TreeNode node, int val) {
        if (node==null){
            TreeNode treeNode = new TreeNode(val);
            return treeNode;
        }
        if(val<node.val){
            node.left = insert(node.left, val);
        } else if (val>node.val) {
            node.right = insert(node.right, val);
        }

        return node;
    }
}
