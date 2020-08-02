package cn.hackcoder;

import java.util.Stack;

/**
 * 1047. Remove All Adjacent Duplicates In String
 */
public class RemoveAllAdjacentDuplicatesInString {

	public String removeDuplicates(String S) {
		Stack<Character> stack = new Stack<>();
		for (char c : S.toCharArray()) {
			if (!stack.isEmpty()) {
				if (stack.peek() == c) {
					stack.pop();
				} else {
					stack.push(c);
				}
			} else {
				stack.push(c);
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(new RemoveAllAdjacentDuplicatesInString().removeDuplicates("abbaca"));
	}
}
