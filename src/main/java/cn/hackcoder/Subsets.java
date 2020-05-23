package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 */
public class Subsets {
	private void subsets(List<List<Integer>> ans, List<Integer> cur, int i, int[] nums) {
		if (i == nums.length) {
			ans.add(new ArrayList<>(cur));
			return;
		}
		cur.add(nums[i]);
		subsets(ans, cur, i + 1, nums);
		cur.remove(cur.size() - 1);
		subsets(ans, cur, i + 1, nums);
	}

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		subsets(ans, new ArrayList<>(), 0, nums);
		return ans;
	}

	public static void main(String[] args) {
		List<List<Integer>> ans = new Subsets().subsets(new int[]{});
		for (List<Integer> list : ans) {
			System.out.println(list);
		}
	}
}
