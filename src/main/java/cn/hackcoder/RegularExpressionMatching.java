package cn.hackcoder;

/**
 * Created by Thinsky on 16/4/20.
 */
public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }
        if (p.length() > 1 && p.charAt(1) == '*') {  // second char is '*'
            if (isMatch(s, p.substring(2))) {
                return true;
            }
            if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
                return isMatch(s.substring(1), p);
            }
            return false;
        } else {                                     // second char is not '*'
            if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
                return isMatch(s.substring(1), p.substring(1));
            }
            return false;
        }
    }

    /**
     * isMatch("aa","a") → false
     * isMatch("aa","aa") → true
     * isMatch("aaa","aa") → false
     * isMatch("aa", "a*") → true
     * isMatch("aa", ".*") → true
     * isMatch("ab", ".*") → true
     * isMatch("aab", "c*a*b") → true
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a") == false);
        System.out.println(isMatch("aa", "aa") == true);
        System.out.println(isMatch("aaa", "aa") == false);
        System.out.println(isMatch("aa", "a*") == true);
        System.out.println(isMatch("aa", ".*") == true);
        System.out.println(isMatch("ab", ".*") == true);
        System.out.println(isMatch("aab", "c*a*b") == true);
    }

}
