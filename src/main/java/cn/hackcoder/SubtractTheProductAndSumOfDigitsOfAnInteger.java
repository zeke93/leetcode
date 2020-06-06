package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
	public int subtractProductAndSum(int n) {
		List<Integer> nums = new ArrayList<>();
		while (n != 0) {
			nums.add(n % 10);
			n /= 10;
		}
		return nums.stream().reduce(1, (l, r) -> l * r) - nums.stream().mapToInt(i -> i).sum();
	}

	public static void main(String[] args) {
		System.out.println(new SubtractTheProductAndSumOfDigitsOfAnInteger().subtractProductAndSum(234));
		System.out.println(new SubtractTheProductAndSumOfDigitsOfAnInteger().subtractProductAndSum(4421));
	}
}
