package cn.hackcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Thinsky on 16/3/4.
 */
public class BinaryTreeLevelOrderTraversalII {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        levelOrder(root, lists, 0);
        Collections.reverse(lists);
        return lists;
    }

    public void levelOrder(TreeNode root, List<List<Integer>> lists, int level) {
        if (root == null) return;
        if (lists.size() < level + 1) {
            lists.add(new ArrayList<Integer>());
        }
        lists.get(level).add(root.val);
        levelOrder(root.left, lists, level + 1);
        levelOrder(root.right, lists, level + 1);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode2.left = treeNode4;
        treeNode1.right = treeNode3;
        treeNode3.right = treeNode5;

        List<List<Integer>> lists = new BinaryTreeLevelOrderTraversalII().levelOrderBottom(treeNode1);

        for (List<Integer> list : lists) {
            for (Integer i : list) {
                System.out.println(i);
            }
            System.out.println("---------");
        }
    }
}
