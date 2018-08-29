package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 47. Permutations II
 */
public class PermutationsII {
    static List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        results.clear();

        permutationUnique(nums, 0);
        return results;
    }

    public static void permutationUnique(int[] nums, int start) {
        if (start == nums.length - 1) {
            List<Integer> numList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                numList.add(nums[i]);
            }
            results.add(numList);
        }

        outer:
        for (int i = start; i < nums.length; i++) {
            if (i != start) {
                for (int t = start; t < i; t++) {
                    if (nums[t] == nums[i]) continue outer;
                }
            }

            swap(nums, start, i);
            permutationUnique(nums, start + 1);
            swap(nums, start, i);
        }
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public static void main(String[] args) {
        for (List<Integer> integers : new PermutationsII().permuteUnique(new int[]{2, 1, 1})) {
            System.out.println(integers);
        }

        System.out.println("========================");
        for (List<Integer> integers : new PermutationsII().permuteUnique(new int[]{1, 1, 2})) {
            System.out.println(integers);
        }
        System.out.println("========================");
        for (List<Integer> integers : new PermutationsII().permuteUnique(new int[]{1, 2, 1})) {
            System.out.println(integers);
        }
    }
}
