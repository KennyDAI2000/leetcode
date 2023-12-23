package Binary_Tree;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        InvertLevel(root);
        return root;
    }

    public void InvertLevel(TreeNode node){
        if(node==null) return;

        TreeNode temp = node.left;
        node.left =node.right;
        node.right = temp;

        InvertLevel(node.left);
        InvertLevel(node.right);
    }
}
