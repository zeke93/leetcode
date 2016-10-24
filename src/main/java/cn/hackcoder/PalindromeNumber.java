package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/8.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        String a = sb.toString();
        String b = sb.reverse().toString();
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(12332));
    }
}
