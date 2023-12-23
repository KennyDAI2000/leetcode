package Binary_Tree;

public class CompleteBinaryTreeNodes {
    public int countNodes(TreeNode root) {
        return countCompleteNodes(root);
    }

    public int countCompleteNodes(TreeNode node){
        int depth = 1;
        TreeNode temp1 = node;
        TreeNode temp2 = node;
        while(temp2!=null){
            temp1 = temp1.left;
            temp2 = temp2.right;
            depth++;
        }
        if(temp1==null) {
            return 2<<depth-1;
        }else {
            int left = countCompleteNodes(node.left);
            int right = countCompleteNodes(node.right);
            return left+right+1;
        }

    }
}
