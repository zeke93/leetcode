package cn.hackcoder;

import java.util.*;

/**
 * Created by linzhichao on 2017/10/21.
 */
public class AverageofLevelsinBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            res.add(level);
        }
        List<Double> result = new ArrayList<>();
        for (List<Integer> list : res) {
            result.add(list.stream().mapToInt(i -> i).average().getAsDouble());
        }
        return result;
    }
}
