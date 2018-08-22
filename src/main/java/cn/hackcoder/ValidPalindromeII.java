package cn.hackcoder;

/**
 * Created by linzhichao on 2017/10/22.
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) != sb.charAt(i)) {
                break;
            }
        }
        if (i != s.length() ) {
            StringBuilder sb2 = new StringBuilder(s);
            sb2 = sb2.delete(i, i + 1);
            sb = sb.delete(s.length() - 1 - i, s.length() - i);
            if (!sb.toString().equals(sb2.toString())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindromeII().validPalindrome("aba"));
        System.out.println(new ValidPalindromeII().validPalindrome("abca"));
        System.out.println(new ValidPalindromeII().validPalindrome("abc"));
    }
}
