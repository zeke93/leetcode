package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 95. Unique Binary Search Trees II
 */
public class UniqueBinarySearchTreesII {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<TreeNode> generateTrees(int n) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }
        List<List<Integer>> permutes = permute(nums);

        List<TreeNode> results = new ArrayList<>();
        List<List<Integer>> preorderTraversalResults = new ArrayList<>();
        for (List<Integer> permute : permutes) {
            List<Integer> result = new ArrayList<>();
            TreeNode root = constructBinaryTree(permute);
            preorder(root, result);

            if (!preorderTraversalResults.contains(result)) {
                preorderTraversalResults.add(result);
                results.add(root);
            }
        }
        return results;
    }

    private List<List<Integer>> permuteResults = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permuteResults.clear();
        permutation(nums, 0);
        return permuteResults;
    }

    public void permutation(int[] nums, int start) {
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
        new UniqueBinarySearchTreesII().generateTrees(3).forEach(root -> {
            List<Integer> result = new ArrayList<>();
            new UniqueBinarySearchTreesII().preorder(root, result);
            for (Integer i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        });
    }
}
