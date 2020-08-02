package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 1441. Build an Array With Stack Operations
 */
public class BuildAnArrayWithStackOperations {
	private final static String PUSH = "Push";
	private final static String POP = "Pop";

	public List<String> buildArray(int[] target, int n) {
		if (target.length == 0) return new ArrayList<>();

		List<String> list = new ArrayList<>();

		for (int i = 1; i <= n && i <= target[target.length - 1]; i++) {
			boolean find = false;
			for (int targetNum : target) {
				if (i == targetNum) {
					find = true;
					break;
				}
			}
			list.add(PUSH);
			if (!find) list.add(POP);
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(new BuildAnArrayWithStackOperations().buildArray(new int[]{1, 3}, 3));
		System.out.println(new BuildAnArrayWithStackOperations().buildArray(new int[]{1, 2, 3}, 3));
		System.out.println(new BuildAnArrayWithStackOperations().buildArray(new int[]{1, 2}, 4));
		System.out.println(new BuildAnArrayWithStackOperations().buildArray(new int[]{2, 3, 4}, 4));
	}
}
