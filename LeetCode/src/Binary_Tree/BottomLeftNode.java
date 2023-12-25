package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftNode {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        TreeNode temp = new TreeNode();
        while (!que.isEmpty()){
            temp = que.poll();
            if(temp.right!=null) que.add(temp.right);
            if(temp.left!=null) que.add(temp.left);
        }
        return temp.val;
    }

    /**递归


    int maxDepth = Integer.MIN_VALUE;
    int result;
    public int findBottomLeftValue(TreeNode root) {
        BottomLeft(root, 0);
        return result;
    }
    public void BottomLeft(TreeNode node, int depth){
        if (node.left==null&&node.right==null){
            if(depth>maxDepth){
                maxDepth = depth;
                result = node.val;
                return;
            }
        }

        if(node.left!=null){
            depth++;
            BottomLeft(node.left, depth);
            depth--;
        }
        if(node.right!=null){
            depth++;
            BottomLeft(node.right, depth);
            depth--;
        }
    }
    */
}
