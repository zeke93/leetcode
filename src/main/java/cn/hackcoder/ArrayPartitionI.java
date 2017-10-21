package cn.hackcoder;

import java.util.Arrays;

/**
 * Created by linzhichao on 2017/10/21.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) maxSum += nums[i];
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayPartitionI().arrayPairSum(new int[]{1, 4, 3, 2}));
    }
}
