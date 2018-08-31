package cn.hackcoder;

import java.util.*;

/**
 * 103. Binary Tree Zigzag Level Order Traversal
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        Queue<TreeNode> queue = new ArrayDeque();
        Map<TreeNode, Integer> nodeLevelMap = new HashMap();

        queue.add(root);
        nodeLevelMap.put(root, 1);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            Integer level = nodeLevelMap.get(node);

            if (results.size() < level) {
                List<Integer> nodeLevels = new ArrayList<>();
                nodeLevels.add(node.val);
                results.add(nodeLevels);
            } else {
                results.get(level - 1).add(node.val);
            }

            if (node.left != null) {
                queue.add(node.left);
                nodeLevelMap.put(node.left, level + 1);
            }
            if (node.right != null) {
                queue.add(node.right);
                nodeLevelMap.put(node.right, level + 1);
            }
        }
        for (int i = 0; i < results.size(); i++) {
            if (i % 2 != 0) {
                Collections.reverse(results.get(i));
            }
        }
        return results;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        root.left = node1;
        root.right = node2;

        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node2.left = node3;
        node2.right = node4;

        new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root);
    }
}
