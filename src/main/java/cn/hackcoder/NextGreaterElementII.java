package cn.hackcoder;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
	public int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int[] res = new int[nums.length * 2];
		int[] extendNums = new int[nums.length * 2];

		for (int i = 0; i < extendNums.length; i++) {
			res[i] = -1;
			extendNums[i] = nums[i % nums.length];
		}


		for (int i = 0; i < extendNums.length; i++) {
			int val = extendNums[i];
			while (!stack.isEmpty() && extendNums[stack.peek()] < val) {
				res[stack.pop()] = val;
			}
			stack.push(i);
		}
		return Arrays.copyOf(res, nums.length);
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new NextGreaterElementII().nextGreaterElements(new int[]{1, 2, 1})));
	}
}
