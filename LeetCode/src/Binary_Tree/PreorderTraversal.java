package Binary_Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        preorderTraversal(root);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Traversal(root, res);
        return res;
    }

    public static void Traversal(TreeNode root, List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        Traversal(root.left, res);
        Traversal(root.right, res);
    }
}
