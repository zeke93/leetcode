package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        List<Integer> left = inorderTraversal(root.left);
        results.addAll(left);
        results.add(root.val);
        List<Integer> right = inorderTraversal(root.right);
        results.addAll(right);
        return results;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        root.right = node2;
        TreeNode node3 = new TreeNode(3);
        node2.left = node3;

        binaryTreeInorderTraversal.inorderTraversal(root).forEach(e -> {
            System.out.println(e);
        });
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
