package cn.hackcoder;

/**
 * 1295. Find Numbers with Even Number of Digits
 */
public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int res = 0;
		for (int num : nums) {
			res = ("" + num).length() % 2 == 0 ? ++res : res;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new FindNumbersWithEvenNumberOfDigits().findNumbers(new int[]{12, 345, 2, 6, 7896}));
		System.out.println(new FindNumbersWithEvenNumberOfDigits().findNumbers(new int[]{555, 901, 482, 1771}));
	}
}
