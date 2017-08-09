package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linzhichao on 2017/8/10.
 */
public class SummaryRanges {

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

    public static void main(String[] args) {
        new SummaryRanges().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}).forEach(System.out::println);
    }
}
