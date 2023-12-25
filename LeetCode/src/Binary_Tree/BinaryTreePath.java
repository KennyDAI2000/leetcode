package Binary_Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    /*@Test
    public void test(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers.get(integers.size()-1));
    }*/


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        PathTraversal(root, path, res);
        return res;
    }

    public void PathTraversal(TreeNode node, List<Integer> path, List<String> res){
        path.add(node.val);
        if(node.left==null&&node.right==null){
            res.add(path.toString().replace(", ", "->").replace("]", "").replace("[", ""));
            return;
        }

        if(node.left!=null){
            PathTraversal(node.left, path, res);
            path.remove(path.size()-1);
        }

        if(node.right!=null){
            PathTraversal(node.right, path, res);
            path.remove(path.size()-1);
        }
    }
}
