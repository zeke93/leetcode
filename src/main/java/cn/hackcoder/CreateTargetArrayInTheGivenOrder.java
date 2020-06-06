package cn.hackcoder;

import java.util.Arrays;

/**
 * 1389. Create Target Array in the Given Order
 */
public class CreateTargetArrayInTheGivenOrder {
	public int[] createTargetArray(int[] nums, int[] index) {
		int[] res = new int[nums.length];
		//initial
		for (int i = 0; i < nums.length; i++) res[i] = -1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 2; j >= index[i]; j--) {
				if (res[j] == -1) {
					continue;
				}
				res[j + 1] = res[j];
			}
			res[index[i]] = nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new CreateTargetArrayInTheGivenOrder().createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
		System.out.println(Arrays.toString(new CreateTargetArrayInTheGivenOrder().createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0})));
		System.out.println(Arrays.toString(new CreateTargetArrayInTheGivenOrder().createTargetArray(new int[]{1}, new int[]{0})));
	}
}
