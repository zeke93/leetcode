package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/23.
 */
public class MaximumDepthofBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth >= rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
}
