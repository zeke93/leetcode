package cn.hackcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by Thinsky on 16/3/24.
 */
public class BinaryTreePaths {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        dfs(root, new Stack<Integer>(), paths);
        return paths;
    }

    public void dfs(TreeNode root, Stack<Integer> stack, List<String> paths) {
        if (root == null) return;
        stack.add(root.val);
        if (root.left == null && root.right == null) {
            Iterator<Integer> iter = stack.iterator();
            String path = "";
            int i = 1;
            while (iter.hasNext()) {
                if (stack.size() != i++) {
                    path += iter.next() + "->";
                } else {
                    path += iter.next();
                }
            }

            paths.add(path);
        }
        dfs(root.left, stack, paths);
        dfs(root.right, stack, paths);
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
        List<String> paths = new BinaryTreePaths().binaryTreePaths(treeNode1);
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
