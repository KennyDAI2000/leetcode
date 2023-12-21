package Binary_Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> cur = new Stack<>();
        cur.push(root);
        while (!cur.isEmpty()){
            TreeNode curNode = cur.pop();
            if(curNode==null) break;
            res.add(curNode.val);
            cur.push(curNode.left);
            cur.push(curNode.right);
        }

        int left = 0;
        int right = res.size()-1;
        for(int i=0; i<res.size();i++){
            int temp = res.get(left);
            res.set(left, res.get(right));
            res.set(right, temp);
            left++;
            right--;
        }

        return res;
    }
}
