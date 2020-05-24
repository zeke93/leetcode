package cn.hackcoder;

/**
 * 238. Product of Array Except Self
 */
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] prefix = new int[nums.length];
		int[] suffix = new int[nums.length];

		prefix[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = prefix[i - 1] * nums[i - 1];
		}
		suffix[nums.length - 1] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < nums.length; i++) {
			suffix[i] = suffix[i] * prefix[i];
		}
		return suffix;
	}

	public static void main(String[] args) {
//		int[] ans = new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4});
		int[] ans = new ProductOfArrayExceptSelf().productExceptSelf(new int[]{0, 0});
		for (int n : ans) {
			System.out.print(n + ", ");
		}
	}
}
