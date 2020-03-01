package cn.hackcoder;

/**
 * 1021. Remove Outermost Parentheses
 */
public class RemoveOutermostParentheses {
	public String removeOuterParentheses(String S) {
		String s = "";
		int l = 0;
		int leftCnt = 0;
		int rightCnt = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				leftCnt++;
			} else {
				rightCnt++;
			}
			if (leftCnt == rightCnt) {
				s += S.substring(l + 1, i);
				l = i+1;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(new RemoveOutermostParentheses().removeOuterParentheses("()()"));
	}
}
