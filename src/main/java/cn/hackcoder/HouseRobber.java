package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/4.
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) {
            return nums[0];
        }
        int[] marks = new int[nums.length + 1];
        marks[0] = nums[0];
        marks[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            marks[i] = Math.max(nums[i] + marks[i - 2], marks[i - 1]);
        }
        return marks[nums.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(new HouseRobber().rob(new int[]{1,2}));
    }
}
