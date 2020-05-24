package cn.hackcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * 287. Find the Duplicate Number
 */
public class FindTheDuplicateNumber {
	public int findDuplicate(int[] nums) {
		int res = nums[0];
		Set<Integer> sets = new HashSet<>();
		for (int num : nums) {
			if (!sets.add(num)) return num;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new FindTheDuplicateNumber().findDuplicate(new int[]{1, 3, 4, 2, 2}));
	}
}
