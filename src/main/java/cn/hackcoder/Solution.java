package cn.hackcoder;

/**
 * Created by thinsky on 2017/8/1.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        boolean isFinish = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && i != nums.length - 1) {
                if (nums[i + 1] != 0) {
                    isFinish = false;
                }
                int tmp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = tmp;

            }
        }
        if (!isFinish) moveZeroes(nums);
    }
}
