package cn.hackcoder;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 */
public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		Map<Character, Integer> location = new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (location.get(c) == null) {
				location.put(c, i);
			} else {
				location.put(c, -1);
			}
		}
		for (Integer index : location.values()) {
			if (index >= 0) return index;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(new FirstUniqueCharacterInAString().firstUniqChar("leetcode"));
	}
}
