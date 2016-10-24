package cn.hackcoder;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by thinsky on 16-6-15.
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        Map<Integer, Integer> added = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            boolean contain = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nums2[j] = Integer.MAX_VALUE;
                    contain = true;
                    break;
                }
            }
            if (contain) {
                result.add(nums1[i]);
            }
        }
        int[] data = new int[result.size()];
        int index = 0;
        for (Integer i : result) {
            data[index++] = i;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] result = new IntersectionOfTwoArraysII().intersect(new int[]{1, 2, 2, 1}, new int[]{2,2});
        for (int i : result) {
            System.out.println(i);
        }
    }
}
