package cn.hackcoder;

import java.util.*;

/**
 * 49. Group Anagrams
 */
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> group = new HashMap<>();
		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String newStr = new String(chars);
			group.putIfAbsent(newStr, new ArrayList<>());
			group.get(newStr).add(str);
		}
		List<List<String>> res = new ArrayList<>();
		for (List<String> list : group.values()) {
			res.add(list);
		}
		return res;
	}

	public static void main(String[] args) {
		List<List<String>> res = new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
		System.out.println(res);

	}
}
