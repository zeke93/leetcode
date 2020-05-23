package cn.hackcoder;

/**
 * 69. Sqrt(x)
 */
public class SqrtX {
	public int mySqrt(int x) {
		return (int)Math.sqrt(x);
	}

	public static void main(String[] args) {
		System.out.println(new SqrtX().mySqrt(4));
		System.out.println(new SqrtX().mySqrt(8));
	}
}
