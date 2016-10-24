package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/3.
 */
public class BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(depth(root.left) - depth(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode treeNode) {
        if (treeNode == null) return 0;
        int left = depth(treeNode.left);
        int right = depth(treeNode.right);
        if (left >= right) return left + 1;
        return right + 1;
    }
}
