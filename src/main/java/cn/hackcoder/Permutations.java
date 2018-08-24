package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 */
public class Permutations {
    private static List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        results.clear();
        permutation(nums, 0);
        return results;
    }

    public static void permutation(int[] nums, int start) {
        if (start == nums.length - 1) {
            List<Integer> numList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                numList.add(nums[i]);
            }
            results.add(numList);
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
        for (List<Integer> integers : new Permutations().permute(new int[]{1})) {
            System.out.println(integers);
        }
    }
}
