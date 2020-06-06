package cn.hackcoder;

/**
 * 1342. Number of Steps to Reduce a Number to Zero
 */
public class NumberOfStepsToReduceANumberToZero {
	public int numberOfSteps(int num) {
		int res = 0;
		while (num != 0) {
			num = num % 2 == 0 ? num / 2 : num - 1;
			res++;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new NumberOfStepsToReduceANumberToZero().numberOfSteps(8));
		System.out.println(new NumberOfStepsToReduceANumberToZero().numberOfSteps(123));
	}
}
