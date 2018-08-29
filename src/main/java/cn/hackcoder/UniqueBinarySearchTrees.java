package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 96. Unique Binary Search Trees
 */
public class UniqueBinarySearchTrees {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = G[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
//    public int numTrees(int n) {
//        int[] nums = new int[n];
//        for (int i = 1; i <= n; i++) {
//            nums[i - 1] = i;
//        }
//        List<List<Integer>> permutes = permute(nums);
//
//        List<List<Integer>> preorderTraversalResults = new ArrayList<>();
//        for (List<Integer> permute : permutes) {
//            List<Integer> result = new ArrayList<>();
//            preorder(constructBinaryTree(permute), result);
//
//            if (!preorderTraversalResults.contains(result)) {
//                preorderTraversalResults.add(result);
//            }
//        }
//        return preorderTraversalResults.size();
//    }


    private static List<List<Integer>> permuteResults = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permuteResults.clear();
        permutation(nums, 0);
        return permuteResults;
    }

    public static void permutation(int[] nums, int start) {
        if (start == nums.length - 1) {
            List<Integer> numList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                numList.add(nums[i]);
            }
            permuteResults.add(numList);
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permutation(nums, start + 1);
            swap(nums, start, i);
        }
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    TreeNode constructBinaryTree(List<Integer> nums) {
        if (nums == null || nums.size() == 0) return null;
        TreeNode root = new TreeNode(nums.get(0));
        for (int i = 1; i < nums.size(); i++) {
            insert(root, nums.get(i));
        }
        return root;
    }

    void insert(TreeNode root, int num) {
        if (root.val > num) {
            if (root.left == null) {
                root.left = new TreeNode(num);
                return;
            } else {
                insert(root.left, num);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(num);
                return;
            } else {
                insert(root.right, num);
            }
        }

    }

    void preorder(TreeNode root, List<Integer> results) {
        if (root == null) {
            return;
        }
        results.add(root.val);
        preorder(root.left, results);
        preorder(root.right, results);
    }

    public static void main(String[] args) {
//        List<Integer> treeNodes = new ArrayList<>();
//        treeNodes.add(1);
//        treeNodes.add(3);
//        treeNodes.add(2);
//        UniqueBinarySearchTrees sample = new UniqueBinarySearchTrees();
//        TreeNode root = sample.constructBinaryTree(treeNodes);
//        System.out.println(root);
//
//        List<Integer> results = new ArrayList<>();
//        sample.preorder(root, results);
//
//        results.forEach(System.out::println);

        System.out.println(new UniqueBinarySearchTrees().numTrees(3));
    }

}
