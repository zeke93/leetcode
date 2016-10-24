package cn.hackcoder;

/**
 * Created by thinsky on 16-6-23.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < s.length()) {
            if (!isApla(s.charAt(i))) {
                i++;
                continue;
            }

            if (!isApla(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean isApla(char x) {
        if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || (x >= '0' && x <= '9'))
            return true;
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(new ValidPalindrome().isPalindrome("race a car"));
//        System.out.println(new ValidPalindrome().isPalindrome("Marge let's \"went.\" I await news telegram."));
        System.out.println(new ValidPalindrome().isPalindrome("\"Sue,\" Tom smiles\"Selim smote us.\""));

    }
}
