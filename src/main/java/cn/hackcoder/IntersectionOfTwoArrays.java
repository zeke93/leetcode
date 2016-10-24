package cn.hackcoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by thinsky on 16-6-15.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        Map<Integer, Integer> added = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            boolean contain = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    contain = true;
                    break;
                }
            }
            if (contain && added.get(nums1[i]) == null) {
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
}
