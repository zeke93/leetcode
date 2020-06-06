package cn.hackcoder;

/**
 * 1221. Split a String in Balanced Strings
 */
public class SplitAStringIBalancedStrings {
	private int L = -1;
	private int R = 1;

	public int balancedStringSplit(String s) {
		int num = 0;
		int sum = 0;
		for (char c : s.toCharArray()) {
			int val = 0;
			switch (c) {
				case 'L':
					val = L;
					break;
				case 'R':
					val = R;
					break;
			}
			sum += val;
			num = sum == 0 ? ++num : num;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(new SplitAStringIBalancedStrings().balancedStringSplit("RLRRLLRLRL"));
		System.out.println(new SplitAStringIBalancedStrings().balancedStringSplit("RLLLLRRRLR"));
		System.out.println(new SplitAStringIBalancedStrings().balancedStringSplit("LLLLRRRR"));
		System.out.println(new SplitAStringIBalancedStrings().balancedStringSplit("RLRRRLLRLL"));
	}
}
