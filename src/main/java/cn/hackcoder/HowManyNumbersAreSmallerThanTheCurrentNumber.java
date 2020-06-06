package cn.hackcoder;

import java.util.Arrays;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int cnt = 0;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] > nums[j]) ++cnt;
			}
			res[i] = cnt;
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new HowManyNumbersAreSmallerThanTheCurrentNumber().smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
		System.out.println(Arrays.toString(new HowManyNumbersAreSmallerThanTheCurrentNumber().smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})));
		System.out.println(Arrays.toString(new HowManyNumbersAreSmallerThanTheCurrentNumber().smallerNumbersThanCurrent(new int[]{7, 7, 7, 7})));
	}
}
