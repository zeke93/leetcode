package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/23.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) return true;
        if ((s == null && t != null) || ((s != null && t == null))) return false;
        int[] x = new int[200];
        int[] y = new int[200];
        for (int i = 0; i < s.length(); i++) {
            x[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            y[t.charAt(i)]++;
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("rat", "car"));
    }
}
