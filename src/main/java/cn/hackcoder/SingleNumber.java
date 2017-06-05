package cn.hackcoder;

/**
 * Created by thinsky on 2017/6/5.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNum ^= nums[i];
        }
        return singleNum;
    }
}
