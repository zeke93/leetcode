package cn.hackcoder;

/**
 * Created by linzhichao on 2017/8/29.
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int before = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < before) {
                if (index != -1) return false;
                index = i;
            }
            before = nums[i];
        }
        if (index > 0 && index < nums.length - 1) {
            for (int i = 0; i < index; i++) {
                if (nums[index + 1] < nums[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        assert new NonDecreasingArray().checkPossibility(new int[]{3, 4, 2, 3}) == false;
        assert new NonDecreasingArray().checkPossibility(new int[]{2, 3, 3, 2, 4}) == true;
        assert new NonDecreasingArray().checkPossibility(new int[]{4, 3, 2}) == false;
        assert new NonDecreasingArray().checkPossibility(new int[]{4, 2, 3}) == true;
        System.out.println(new NonDecreasingArray().checkPossibility(new int[]{4, 2, 3}));
    }
}
