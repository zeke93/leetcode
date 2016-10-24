package cn.hackcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Thinsky on 16/3/7.
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            Integer[] list = new Integer[i + 1];
            list[0] = 1;
            list[i] = 1;
            for (int j = 0; j < i - 1; j++) {
                List<Integer> pre = results.get(i - 1);
                list[j + 1] = pre.get(j) + pre.get(j + 1);
            }
            List list1 = Arrays.asList(list);
            results.add(list1);
        }
        return results.get(rowIndex);
    }

    public static void main(String[] args) {
        List<Integer> results = new PascalTriangleII().getRow(3);
        for (int i : results) {
            System.out.println(i + " ");
        }
    }
}
