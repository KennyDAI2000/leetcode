package Binary_Tree;

public class DeleteBSTNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        return Delete(root, key);
    }

    public TreeNode Delete(TreeNode node, int key){
        if(node==null) return null;
        if(node.val==key){
            if(node.left==null&node.right==null){
                return null;
            }else if (node.left==null&&node.right!=null){
                return node.right;
            } else if (node.left != null && node.right == null) {
                return node.left;
            }else {
                TreeNode cur = node.right;
                while (cur.left!=null){
                    cur = cur.left;
                }
                cur.left = node.left;
                return node.right;
            }
        }

        if(key<node.val){
            node.left = Delete(node.left, key);
        } else if (key > node.val) {
            node.right = Delete(node.right, key);
        }

        return node;
    }



}

/**傻逼才这么写 :)
 * class Solution {
 public TreeNode deleteNode(TreeNode root, int key) {
 TreeNode node = root;
 TreeNode parent = root;

 if (root == null) {
 return null;
 }

 // 如果要删除的是根节点
 if (root.val == key) {
 // 如果根节点没有子节点或只有一个子节点
 if (root.left == null) {
 return root.right;
 } else if (root.right == null) {
 return root.left;
 }
 // 如果根节点有两个子节点
 replace(root, root.right);
 return root;
 }


 while (node!=null){
 if(node.val>key){
 parent = node;
 node = node.left;
 }else if(node.val<key){
 parent = node;
 node = node.right;
 }else {
 break;
 }
 }

 //未找到
 if(node==null) return root;

 //为叶节点
 if(node.left==null&&node.right==null){
 if(parent.left==node){
 parent.left = null;
 }else {
 parent.right = null;
 }
 //左不为空，右为空，继承父节点方向到左子节点
 }else if(node.left!=null&&node.right==null){
 if(parent.right==node){
 parent.right = node.left;
 }else {
 parent.left = node.left;
 }
 //右不为空，左为空，继承父节点方向到右子节点
 } else if (node.left == null && node.right != null) {
 if(parent.right==node){
 parent.right = node.right;
 }else {
 parent.left = node.right;
 }
 //左右都不为空，父方向向右左子在上，向左右子在上
 } else if (node.left!=null&&node.right!=null){
 replace(node, node.right);
 }

 return root;
 }

 public static void replace(TreeNode parent, TreeNode node){
 TreeNode par = null;
 while (node.left!=null){
 par = node;
 node = node.left;
 }
 parent.val = node.val;
 if (par != null) {
 // 如果最小节点有右子节点，将其移动到最小节点的位置
 par.left = node.right;
 } else {
 // 如果最小节点是直接的右子节点，处理 parent 的右子节点
 parent.right = node.right;
 }
 }
 }*/
