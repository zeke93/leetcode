package cn.hackcoder;

import java.util.Stack;

/**
 * 856. Score of Parentheses
 */
public class ScoreOfParentheses {

	public int scoreOfParentheses(String S) {
		Stack<String> stack = new Stack<>();

		for (char c : S.toCharArray()) {
			if (c == ')') {
				if (stack.isEmpty()) {
					stack.push("1");
				} else if (stack.peek().equals("(")) {
					stack.pop();
					stack.push("1");
					int num = 0;
					while (!stack.isEmpty()) {
						if (stack.peek().equals("(")) break;
						num += Integer.parseInt(stack.pop());
					}
					stack.push(num + "");
				} else {
					int score = 0;
					while (!stack.isEmpty()) {
						if (stack.peek().equals("(")) {
							score *= 2;
							stack.pop();
							break;
						}
						score += Integer.parseInt(stack.pop());
					}
					stack.push("" + score);
				}
			} else {
				stack.push("" + c);
			}
		}
		int score = 0;
		while (!stack.isEmpty()) {
			if (stack.peek().equals("(")) {
				score *= 2;
				break;
			}
			score += Integer.parseInt(stack.pop());
		}
		return score;
	}

	public static void main(String[] args) {
		System.out.println(new ScoreOfParentheses().scoreOfParentheses("()"));
		System.out.println(new ScoreOfParentheses().scoreOfParentheses("()()"));
		System.out.println(new ScoreOfParentheses().scoreOfParentheses("(()())"));
		System.out.println(new ScoreOfParentheses().scoreOfParentheses("(()(()))"));
	}
}
