package Binary_Tree;

public class MergeBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return Traversal(root1, root2);
    }

    public TreeNode Traversal(TreeNode node1, TreeNode node2){
        if (node1==null) return node2;
        if (node2==null) return node1;

        TreeNode node = new TreeNode(node1.val+node2.val);

        node.left = Traversal(node1.left, node2.left);
        node.right = Traversal(node1.right, node2.right);

        return node;
    }


    /** 你看这个代码它好像一坨屎
    public TreeNode Traversal(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null) return null;

        TreeNode node;
        if(node1!=null && node2!=null){
            node = new TreeNode(node1.val+node2.val);
        } else if (node1 != null) {
            node = new TreeNode(node1.val);
        } else {
            node = new TreeNode(node2.val);
        }

        if(node1.left!=null&&node2.left!=null) {
            node.left = Traversal(node1.left, node2.left);
        } else if (node1.left==null&&node2.left!=null) {
            node.left = Traversal(new TreeNode(0), node2.left);
        }else if (node1.left != null) {
            node.left = Traversal(node1.left, new TreeNode(0));
        }else {
            node.left = null;
        }

        if(node1.right!=null&&node2.right!=null) {
            node.right = Traversal(node1.right, node2.right);
        } else if (node1.right==null&&node2.right!=null) {
            node.right = Traversal(new TreeNode(0), node2.right);
        }else if (node1.right != null){
            node.right = Traversal(node1.right, new TreeNode(0));
        }else {
            node.right = null;
        }

        return node;

    }*/
}
