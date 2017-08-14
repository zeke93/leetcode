package cn.hackcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by linzhichao on 2017/8/14.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        if (s.length() == 0 || s.length() == 1) return s.length();
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> visit = new HashMap<>();
            visit.put(s.charAt(i), 1);
            for (int j = i + 1; j < s.length(); j++) {
                if (visit.containsKey(s.charAt(j))) {
                    if (j - i > maxLength) {
                        maxLength = j - i;
                    }
                    break;
                } else if (j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                }
                visit.put(s.charAt(j), 1);
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("aab"));
    }
}
