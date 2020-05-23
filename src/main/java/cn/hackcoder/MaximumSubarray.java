package cn.hackcoder;

/**
 * 53. Maximum Subarray
 */
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int[] sums = new int[nums.length];
		sums[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sums[i] = max(nums[i], sums[i - 1] + nums[i]);
		}
		int max = sums[0];
		for (int i = 1; i < sums.length; i++) {
			max = max(max, sums[i]);
		}
		return max;
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		System.out.println(maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
	}
}