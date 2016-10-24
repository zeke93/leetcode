package cn.hackcoder;

/**
 * Created by Thinsky on 16/1/26.
 */
public class NumArray {
    private int[] sums;

    public NumArray(int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }

        this.sums = sums;
    }

    public int sumRange(int i, int j) {
        return sums[j] - (i == 0 ? 0 : sums[i - 1]);
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}
