package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 98. Validate Binary Search Tree
 */
public class ValidateBinarySearchTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> values = inorder(root);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i - 1) >= values.get(i)) return false;
        }
        return true;
    }

    public static List<Integer> inorder(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) return results;
        results.addAll(inorder(root.left));
        results.add(root.val);
        results.addAll(inorder(root.right));
        return results;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        inorder(root).forEach(System.out::println);

        System.out.println(new ValidateBinarySearchTree().isValidBST(root));
    }


}
