package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/23.
 */
public class MoveZeroes {

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

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
