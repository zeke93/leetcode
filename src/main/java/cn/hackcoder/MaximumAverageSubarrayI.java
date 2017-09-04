package cn.hackcoder;

/**
 * Created by linzhichao on 2017/9/4.
 */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = -Double.MAX_VALUE;
        for (int i = 0; i == 0 || i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            if (maxAvg < sum / (1.0 * k)) {
                maxAvg = sum / (1.0 * k);
            }
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(new int[]{-1}, 1));
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(new int[]{-1, -2}, 2));
    }
}
