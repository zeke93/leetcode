package cn.hackcoder;

/**
 * 1464. Maximum Product of Two Elements in an Array
 */
public class MaximumProductOfTwoElementsInAnArray {
	public int maxProduct(int[] nums) {
		int max = nums[0] > nums[1] ? nums[0] : nums[1];
		int secondMax = nums[0] < nums[1] ? nums[0] : nums[1];
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] > max) {
				int tmp = max;
				max = nums[i];
				secondMax = tmp;
			} else if (nums[i] > secondMax) {
				secondMax = nums[i];
			}
		}
		return (max - 1) * (secondMax - 1);
	}

	public static void main(String[] args) {
		System.out.println(new MaximumProductOfTwoElementsInAnArray().maxProduct(new int[]{3, 4, 5, 2}));
		System.out.println(new MaximumProductOfTwoElementsInAnArray().maxProduct(new int[]{1, 5, 4, 5}));
		System.out.println(new MaximumProductOfTwoElementsInAnArray().maxProduct(new int[]{3, 7}));
	}
}
