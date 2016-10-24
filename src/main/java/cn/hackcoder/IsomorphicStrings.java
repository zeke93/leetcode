package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/23.
 */
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] s1 = new int[255];
        int[] t1 = new int[255];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s1[s.charAt(i)] != t1[t.charAt(i)]) {
                return false;
            } else {
                s1[s.charAt(i)] = t1[t.charAt(i)] = ++count;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }

}
