package cn.hackcoder;

import java.util.Stack;

/**
 * 1021. Remove Outermost Parentheses
 */
public class RemoveOutermostParentheses {
	public String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		int left = 0;
		int right = 0;
		for (char c : S.toCharArray()) {
			if (c == ')') {
				right++;
				if (left == 1) {
					stack.pop();
					left--;
					right--;
				} else if (left == right) {
					StringBuilder s = new StringBuilder();
					while (!stack.isEmpty()) {
						s.append(stack.pop());
					}
					s.deleteCharAt(s.length() - 1);
					sb.append(s.reverse());
				} else {
					stack.push(c);
				}
			} else {
				left++;
				stack.push(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new RemoveOutermostParentheses().removeOuterParentheses("(()())(())"));
		System.out.println(new RemoveOutermostParentheses().removeOuterParentheses("(()())(())(()(()))"));
		System.out.println(new RemoveOutermostParentheses().removeOuterParentheses("()()"));
	}
}
