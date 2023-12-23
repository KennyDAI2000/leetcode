package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
    public int minDepth(TreeNode root) {
        return findMinDepth(root);

    }

    public int findMinDepth(TreeNode node){
        if(node==null) return 0;

        int left = findMinDepth(node.left);
        int right = findMinDepth(node.right);

        if(node.left==null&&node.right!=null) return right+1;
        if(node.right==null&&node.left!=null) return left+1;
        return Math.min(left,right)+1;
    }


}

/** 层序遍历
 * Queue<TreeNode> que = new LinkedList<>();
 *         que.offer(root);
 *         if(root==null) return 0;
 *         int depth = 0;
 *         while (!que.isEmpty()){
 *             depth++;
 *             int queSize = que.size();
 *             while (queSize>0) {
 *                 TreeNode temp = que.poll();
 *                 if (temp != null) {
 *                     if (temp.left == null && temp.right == null) break;
 *                     if (temp.left != null) que.offer(temp.left);
 *                     if (temp.right != null) {
 *                         que.offer(temp.right);
 *                     }
 *                 }
 *                 queSize--;
 *             }
 *             if (queSize != 0) {
 *                 break;
 *             }
 *         }
 *         return depth;
 *
 */