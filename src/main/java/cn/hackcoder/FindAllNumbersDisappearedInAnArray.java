package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linzhichao on 2017/9/1.
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            nums[Math.abs(num) - 1] = -Math.abs(Math.abs(nums[Math.abs(num) - 1]));
        }
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}).forEach(System.out::println);
    }
}
