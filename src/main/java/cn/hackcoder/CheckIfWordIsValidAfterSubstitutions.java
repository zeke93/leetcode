package cn.hackcoder;

import java.util.Stack;

/**
 * 1003. Check If Word Is Valid After Substitutions
 */
public class CheckIfWordIsValidAfterSubstitutions {
	public boolean isValid(String S) {
		Stack<Character> stack = new Stack<>();
		for (char c : S.toCharArray()) {
			if (c == 'c') {
				int i = 0;
				while (!stack.isEmpty()) {
					if (++i == 3) break;
					char ch = stack.pop();
					if (!((i == 1 && ch == 'b') || (i == 2 && ch == 'a'))) return false;
				}
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(new CheckIfWordIsValidAfterSubstitutions().isValid("aabcbc"));
		System.out.println(new CheckIfWordIsValidAfterSubstitutions().isValid("abcabcababcc"));
		System.out.println(new CheckIfWordIsValidAfterSubstitutions().isValid("abccba"));
		System.out.println(new CheckIfWordIsValidAfterSubstitutions().isValid("abccba"));
		System.out.println(new CheckIfWordIsValidAfterSubstitutions().isValid("cababc"));
	}
}
