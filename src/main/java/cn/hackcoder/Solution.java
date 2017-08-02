package cn.hackcoder;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by thinsky on 2017/8/1.
 */
public class Solution {
    public String reverseWords(String s) {
        return Stream.of(s.trim().split("\\s+")).sorted((x, y) -> -1).collect(Collectors.joining(" "));
    }
}
