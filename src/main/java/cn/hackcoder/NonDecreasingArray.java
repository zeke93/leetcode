package cn.hackcoder;

/**
 * Created by linzhichao on 2017/8/29.
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (i - 2 < 0 || nums[i - 2] < nums[i]) nums[i - 1] = nums[i];
                else nums[i] = nums[i - 1];
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        assert new NonDecreasingArray().checkPossibility(new int[]{3, 4, 2, 3}) == false;
        assert new NonDecreasingArray().checkPossibility(new int[]{2, 3, 3, 2, 4}) == true;
        assert new NonDecreasingArray().checkPossibility(new int[]{4, 3, 2}) == false;
        assert new NonDecreasingArray().checkPossibility(new int[]{4, 2, 3}) == true;
        System.out.println(new NonDecreasingArray().checkPossibility(new int[]{4, 2, 3}));
    }
}
