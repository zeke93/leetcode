package cn.hackcoder;

import java.util.*;

/**
 * 347. Top K Frequent Elements
 */
public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> counts = new HashMap<>();
		for (int num : nums) {
			Integer count = counts.get(num);
			count = count == null ? 1 : ++count;
			counts.put(num, count);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(counts.entrySet());
		list.sort((o1, o2) -> o2.getValue() - o1.getValue());
		return list.subList(0, k).stream().mapToInt(i -> i.getKey()).toArray();
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new TopKFrequentElements().topKFrequent(new int[]{1}, 1)));
		System.out.println(Arrays.toString(new TopKFrequentElements().topKFrequent(new int[]{1, 2}, 2)));
		System.out.println(Arrays.toString(new TopKFrequentElements().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
	}
}
