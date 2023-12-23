package Binary_Tree;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return findDepth(root,0);
    }

    public int findDepth(TreeNode node, Integer depth){
        if(node == null) return depth;
        depth++;

        int left = findDepth(node.left, depth);
        int right = findDepth(node.right, depth);

        return Math.max(left, right);
    }

}
