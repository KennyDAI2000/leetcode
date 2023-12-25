package Binary_Tree;

public class IncludePathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currentSum = root.val;

        return hasSumTraversal(root, targetSum, currentSum);

    }

    public boolean hasSumTraversal(TreeNode node, int targetSum, int currentSum) {
        if (currentSum == targetSum) {
            return true;
        }

        if ((node.left == null && node.right == null) || currentSum > targetSum) return false;

        boolean left = false;
        if (node.left != null) {
            currentSum += node.left.val;
            left = hasSumTraversal(node.left, targetSum, currentSum);
            currentSum -= node.left.val;
        }
        boolean right = false;
        if (node.right != null) {
            currentSum += node.right.val;
            right = hasSumTraversal(node.right, targetSum, currentSum);
            currentSum -= node.right.val;
        }

        return left || right;

    }
}
