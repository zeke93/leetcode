package cn.hackcoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Thinsky on 16/3/24.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if (pattern.length() != str.split(" ").length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(pattern.charAt(i)) == null) {
                map.put(pattern.charAt(i), str.split(" ")[i]);
            } else if (!map.get(pattern.charAt(i)).equals(str.split(" ")[i])) {
                return false;
            }
        }
        int sum1 = map.values().size();
        int sum2 = new HashSet<>(map.values()).size();

        return sum1 == sum2;
    }

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new WordPattern().wordPattern("abba", "dog cat cat fish"));
        System.out.println(new WordPattern().wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(new WordPattern().wordPattern("abba", "dog dog dog dog"));
    }
}
