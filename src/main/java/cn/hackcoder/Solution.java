package cn.hackcoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by thinsky on 2017/8/1.
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int last = Integer.MIN_VALUE;
        List<String> result = new ArrayList<>();
        boolean isFirst = true;
        for (int num : nums) {
            if (isFirst || num != last + 1) {
                result.add(String.valueOf(num));
            } else if (num == last + 1) {
                String before = result.get(result.size() - 1);
                if (before.contains("->")) {
                    result.set(result.size() - 1, before.split("->")[0] + "->" + num);
                } else {
                    result.set(result.size() - 1, before + "->" + num);
                }
            }
            last = num;
            isFirst = false;
        }
        return result;
    }
}
