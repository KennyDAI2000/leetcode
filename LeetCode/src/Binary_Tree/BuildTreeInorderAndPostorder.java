package Binary_Tree;

import java.util.HashSet;

public class BuildTreeInorderAndPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return Traversal(inorder, postorder);
    }


    public TreeNode Traversal(int[] inorder, int[] postorder){
        if (postorder.length==0) return null;
        int nodeVal = postorder[postorder.length-1];

        TreeNode node = new TreeNode(nodeVal);
        if (postorder.length==1) return node;

        int nodeIndex = 0;
        for(int i=0; i< inorder.length; i++){
            if(inorder[i]==nodeVal){
                nodeIndex = i;
                break;
            }
        }

        int[] leftInorder = new int[nodeIndex];
        int[] rightInorder = new int[inorder.length-nodeIndex-1];
        System.arraycopy(inorder, 0, leftInorder, 0, leftInorder.length);
        System.arraycopy(inorder, nodeIndex+1, rightInorder, 0, rightInorder.length);

        int[] leftPostorder = new int[leftInorder.length];
        int[] rightPostorder = new int[rightInorder.length];
        System.arraycopy(postorder, 0, leftPostorder, 0, leftPostorder.length);
        System.arraycopy(postorder, nodeIndex, rightPostorder, 0, rightPostorder.length);

        node.left = Traversal(leftInorder, leftPostorder);
        node.right = Traversal(rightInorder, rightPostorder);

        return node;
    }
}

/**中序：左中右
 * 后序：左右中
 *
 * 0 1 2 3 4
 * 3 (3)
 * (3=index)0 1 2
 * (1=size-index-1)4
 */