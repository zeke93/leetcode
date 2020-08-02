package cn.hackcoder;

import java.util.Stack;

/**
 * 946. Validate Stack Sequences
 */
public class ValidateStackSequences {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack<>();
		int i = 0;
		for (int pop : popped) {
			if (!stack.isEmpty() && stack.peek() == pop) {
				stack.pop();
			} else {
				while (i < pushed.length) {
					int push = pushed[i++];
					if (pop == push) {
						break;
					} else {
						stack.push(push);
					}
				}
			}

		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(new ValidateStackSequences().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
		System.out.println(new ValidateStackSequences().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
	}
}
