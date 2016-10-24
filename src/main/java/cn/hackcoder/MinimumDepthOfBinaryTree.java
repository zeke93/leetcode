package cn.hackcoder;

import java.util.Stack;

/**
 * Created by Thinsky on 16/3/11.
 */
public class MinimumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    Integer depth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        depth(root, new Stack<Integer>());
        return depth;
    }

    public void depth(TreeNode root, Stack<Integer> stack) {
        if (root == null) return;
        stack.push(root.val);
        if (root.left == null && root.right == null) {
            depth = depth > stack.size() ? stack.size() : depth;
        }
        depth(root.left,stack);
        depth(root.right,stack);
        stack.pop();

    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        System.out.println(new MinimumDepthOfBinaryTree().minDepth(treeNode1));
    }

}

