package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 */
public class GenerateParentheses {
	public void generateParenthesis(List<String> ans, String cur, int open, int close, int n) {
		if (cur.length() == n * 2) {
			ans.add(cur);
			return;
		}
		if (open < n)
			generateParenthesis(ans, cur + "(", open + 1, close, n);
		if (close < open)
			generateParenthesis(ans, cur + ")", open, close + 1, n);
	}

	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		generateParenthesis(ans, "", 0, 0, n);
		return ans;
	}

	public static void main(String[] args) {
		List<String> strings = new GenerateParentheses().generateParenthesis(3);
		for (String str : strings) {
			System.out.println(str);
		}
	}
}
