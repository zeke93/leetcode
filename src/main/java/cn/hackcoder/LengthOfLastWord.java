package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/24.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s.split(" ").length == 0) return 0;
        return s.split(" ")[s.split(" ").length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord(""));
        System.out.println(new LengthOfLastWord().lengthOfLastWord("hello world"));
    }
}
