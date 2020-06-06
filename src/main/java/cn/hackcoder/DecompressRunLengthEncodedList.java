package cn.hackcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1313. Decompress Run-Length Encoded List
 */
public class DecompressRunLengthEncodedList {
	public int[] decompressRLElist(int[] nums) {
		List<Integer> results = new ArrayList<>();
		for (int i = 0; i < nums.length; i += 2) {
			for (int j = 0; j < nums[i]; j++)
				results.add(nums[i + 1]);
		}
		return results.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new DecompressRunLengthEncodedList().decompressRLElist(new int[]{1, 2, 3, 4})));
		System.out.println(Arrays.toString(new DecompressRunLengthEncodedList().decompressRLElist(new int[]{1, 1, 2, 3})));
	}
}
