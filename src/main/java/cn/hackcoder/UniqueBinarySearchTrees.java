package cn.hackcoder;

/**
 * 96. Unique Binary Search Trees
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        return 0;
    }

    /**
     * 1 23
     * 2 3
     * 3 2
     * 2 13
     * 1 3
     * 3 1
     * 3 12
     * 1 2
     * 2 1
     *
     * @param nums
     * @param start
     */

    public static void permutation(int[] nums, int start) {
        if (start == nums.length - 1) {
            System.out.println(nums);
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


    public static void main(String[] args) {
        permutation(new int[]{1, 2, 3}, 0);

    }
}
