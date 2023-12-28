package Binary_Tree;

public class SearchBST {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(4);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(1);
        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(7);

        root1.left = root2;
        root1.right = root5;
        root2.left = root3;
        root2.right = root4;

        searchBST(root1, 2);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        while (root!=null){
            if(root.val<val){
                root = root.right;
            } else if (root.val>val) {
                root = root.left;
            } else{
                return root;
            }
        }
        return null;
    }
}
