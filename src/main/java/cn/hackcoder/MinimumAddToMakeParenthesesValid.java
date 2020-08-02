package cn.hackcoder;

import java.util.Stack;

/**
 * 921. Minimum Add to Make Parentheses Valid
 */
public class MinimumAddToMakeParenthesesValid {
	public int minAddToMakeValid(String S) {
		Stack<Character> stack = new Stack<>();
		for (char c : S.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					stack.push(c);
				} else if (stack.peek() == '(') {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
		}
		return stack.size();
	}

	public static void main(String[] args) {
		System.out.println(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("())"));
		System.out.println(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("((("));
		System.out.println(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("()"));
		System.out.println(new MinimumAddToMakeParenthesesValid().minAddToMakeValid("()))(("));
	}
}
