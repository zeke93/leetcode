package cn.hackcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by linzhichao on 2017/8/7.
 */
public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        dict.sort(Comparator.comparingInt(String::length));
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (String d : dict) {
                if (word.startsWith(d)) {
                    word = d;
                    break;
                }
            }
            sb.append(word + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        List<String> dict = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(new ReplaceWords().replaceWords(dict, sentence));
    }
}
