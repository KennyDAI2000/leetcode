package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return Symmetric(root.left, root.right);
    }

    public boolean Symmetric(TreeNode nodeLeft, TreeNode nodeRight){
        if(nodeLeft==null&&nodeRight!=null){ return false;}
        else if (nodeLeft!=null && nodeRight==null) { return false; }
        else if (nodeLeft==null && nodeRight==null) { return true; }
        else if (nodeLeft.val!=nodeRight.val) { return false; }

        Boolean outerSymmetric = Symmetric(nodeLeft.left, nodeRight.right);
        Boolean innerSymmetric = Symmetric(nodeLeft.right, nodeRight.left);

        boolean res = outerSymmetric && innerSymmetric;
        return res;
    }
}
