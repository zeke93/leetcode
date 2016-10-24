package cn.hackcoder;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

/**
 * Created by Thinsky on 16/3/10.
 */
public class PathSum {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        Set<Integer> set = new HashSet<>();
        depthFirstSearch(root, new Stack<Integer>(), set);
        for (Integer i : set) {
            if (sum == i) return true;
        }
        return false;
    }
//[1,-2,-3,1,3,-2,null,-1] 3 expect false
    public static void depthFirstSearch(TreeNode root, Stack<Integer> stack, Set<Integer> pathSums) {
        if (root == null) return;
        stack.push(root.val);
        if (root.left == null && root.right == null) {
            int pathSum = 0;
            Iterator<Integer> integerIterator = stack.iterator();
            System.out.println("=========== 开始 ============");
            while (integerIterator.hasNext()){
                int value = integerIterator.next();
                System.out.print(value + " + ");
                pathSum += value;
            }
            System.out.println(" = " + pathSum);
            System.out.println("=========== 结束 ============");
            pathSums.add(pathSum);
        }
        depthFirstSearch(root.left, stack, pathSums);
        depthFirstSearch(root.right, stack, pathSums);
        stack.pop();
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(-2);
        TreeNode treeNode3 = new TreeNode(-3);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(-2);
        TreeNode treeNode7 = new TreeNode(-1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode4.left = treeNode7;
        Set<Integer> set = new HashSet<>();
        depthFirstSearch(treeNode1, new Stack<Integer>(), set);
        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
