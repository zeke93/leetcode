package cn.hackcoder;

/**
 * Created by thinsky on 16-6-23.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curMin = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            curMin = Math.min(curMin, prices[i]);
            max = Math.max(max, prices[i] - curMin);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        long current = System.currentTimeMillis();
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(prices));
        System.out.println((System.currentTimeMillis() - current));
    }
}
