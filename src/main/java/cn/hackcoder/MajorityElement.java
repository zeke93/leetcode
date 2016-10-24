package cn.hackcoder;

import java.util.Arrays;

/**
 * Created by Thinsky on 16/2/24.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{1, 2, 3, 2, 2}));
    }
}
