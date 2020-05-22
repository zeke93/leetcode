package cn.hackcoder;

/**
 * #268
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {

        int missNum = nums.length;
        for (int i = 0; i < nums.length; i++) {

            missNum += i - nums[i];
        }
        return missNum;
    }

}
