package Tree;

import java.util.ArrayList;
import java.util.List;

public class L094_InorderTraversal {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        List<Integer> ret = new L094_InorderTraversal().inorderTraversal(t1);
        System.out.println(ret);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    private void helper(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, list);
            }
            list.add(root.val);
            if (root.right != null) {
                helper(root.right, list);
            }
        }
    }
}
