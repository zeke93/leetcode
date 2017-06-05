package cn.hackcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Thinsky on 16/3/5.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            Integer[] temp = new Integer[i + 1];
            temp[0] = temp[i] = 1;
            for (int j = 0; j < i - 1; j++) {
                List<Integer> pre = results.get(i - 1);
                temp[j + 1] = pre.get(j) + pre.get(j + 1);
            }
            results.add(Arrays.asList(temp));
        }
        return results;
    }

    public static void main(String[] args) {
        List<List<Integer>> results = new PascalTriangle().generate(5);
        for (List<Integer> list : results) {
            for (int i : list) {
                System.out.println(i + " ");
            }
            System.out.println("--------");
        }
    }
}
