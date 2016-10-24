package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/1.
 */
public class LCA {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int left = p.val;
        int right = q.val;
        if (left > right) {
            int temp = left;
            left = right;
            right = temp;
        }
        while (true) {
            if (root.val < left) {
                root = root.right;
            } else if (root.val > right) {
                root = root.left;
            } else {
                return root;
            }
        }
    }
}
