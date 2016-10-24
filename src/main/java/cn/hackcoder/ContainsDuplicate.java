package cn.hackcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Thinsky on 16/2/23.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{}));
    }
}
