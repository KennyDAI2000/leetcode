package Binary_Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindMode {
    int maxCount;
    int localCount=1;

    TreeNode pre;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        findMost(root);
        int[] res = new int[list.size()];
        for(int i=0; i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public void findMost(TreeNode node){
        if(node==null) return;

        findMost(node.left);

        if(pre!=null && node.val==pre.val){
            localCount++;
        } else if (pre != null) {
            localCount = 1;
        }

        if(localCount==maxCount){
            if(node.val!=list.get(list.size()-1)) list.add(node.val);
        } else if (localCount>maxCount) {
            maxCount = localCount;
            list.clear();
            list.add(node.val);
        }
        pre = node;

        findMost(node.right);
    }

}
