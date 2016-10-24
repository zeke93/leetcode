package cn.hackcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Thinsky on 16/3/24.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        List<String> list = Arrays.asList(strs);
        Collections.sort(list);
        String a = list.get(0);
        String b = list.get(strs.length - 1);
        int length = a.length() > b.length() ? b.length() : a.length();
        int i;
        for (i = 0; i < length && a.charAt(i) == b.charAt(i); i++) ;
        return a.substring(0, i);
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{}));
    }
}
