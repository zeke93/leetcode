package cn.hackcoder;

import java.util.Stack;

/**
 * 1190. Reverse Substrings Between Each Pair of Parentheses
 */
public class ReverseSubstringsBetweenEachPairofParentheses {
	public String reverseParentheses(String s) {
		StringBuilder sb = new StringBuilder(s);
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else if (s.charAt(i) == ')') {
				int left = stack.pop();
				StringBuilder reserver = new StringBuilder(sb.substring(left, i)).reverse();
				sb.replace(left, i, reserver.toString());
			}
		}
		return sb.toString().replaceAll("[\\(\\)]", "");
	}

	public static void main(String[] args) {
		System.out.println(new ReverseSubstringsBetweenEachPairofParentheses().reverseParentheses("(abcd)"));
		System.out.println(new ReverseSubstringsBetweenEachPairofParentheses().reverseParentheses("(u(love)i)"));
		System.out.println(new ReverseSubstringsBetweenEachPairofParentheses().reverseParentheses("(ed(et(oc))el)"));
		System.out.println(new ReverseSubstringsBetweenEachPairofParentheses().reverseParentheses("a(bcdefghijkl(mno)p)q"));
	}
}
