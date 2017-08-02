package cn.hackcoder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by thinsky on 2017/8/2.
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        return Stream.of(s.trim().split("\\s+")).sorted((x, y) -> -1).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAString().reverseWords("  a   b   "));
        System.out.println("dasdas".split(" ").length);
    }
}
