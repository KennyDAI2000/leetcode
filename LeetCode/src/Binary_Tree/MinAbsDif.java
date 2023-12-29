package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class MinAbsDif {
    TreeNode pre;
    int dif = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        findMin(root);
        return dif;
    }
    public void findMin(TreeNode node){
        if(node==null) return;
        findMin(node.left);
        if (pre!=null && Math.abs(pre.val-node.val)<dif) {
            dif = Math.abs(pre.val-node.val);
        }
        pre = node;
        findMin(node.right);
    }
}
