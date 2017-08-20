package cn.hackcoder;

/**
 * Created by linzhichao on 2017/8/20.
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        while (root.val < p.val || root.val > q.val) {
            if (root.val < p.val) {
                root = root.right;
            }
            if (root.val > q.val) {
                root = root.left;
            }
        }
        return root;
    }
}
