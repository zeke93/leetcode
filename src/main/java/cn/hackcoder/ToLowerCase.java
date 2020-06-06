package cn.hackcoder;

/**
 * 709. To Lower Case
 */
public class ToLowerCase {
	public String toLowerCase(String str) {
		return str.toLowerCase();
	}

	public static void main(String[] args) {
		System.out.println(new ToLowerCase().toLowerCase("Hello"));
		System.out.println(new ToLowerCase().toLowerCase("here"));
		System.out.println(new ToLowerCase().toLowerCase("LOVELY"));
	}
}
