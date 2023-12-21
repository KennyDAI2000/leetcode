package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tempRes = new ArrayList<>();
            while (size>0){
                TreeNode cur = queue.poll();
                if(cur!=null) {
                    if(cur.left!=null)queue.add(cur.left);
                    if(cur.right!=null)queue.add(cur.right);
                    tempRes.add(cur.val);
                }
                size--;
            }
            res.add(tempRes);
        }

        return res;
    }
}
