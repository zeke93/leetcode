package cn.hackcoder;

/**
 * 509. Fibonacci Number
 */
public class FibonacciNumber {
	public int fib(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		int[] fn = new int[N + 1];
		fn[0] = 0;
		fn[1] = 1;
		for (int i = 2; i <= N; i++) {
			fn[i] = fn[i - 1] + fn[i - 2];
		}
		return fn[N];
	}

	public static void main(String[] args) {
		System.out.println(new FibonacciNumber().fib(2));
		System.out.println(new FibonacciNumber().fib(3));
		System.out.println(new FibonacciNumber().fib(4));
	}
}
