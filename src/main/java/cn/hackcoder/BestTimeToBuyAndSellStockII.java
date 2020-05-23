package cn.hackcoder;

/**
 * 122. Best Time to Buy and Sell Stock II
 */
public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			profit += prices[i] - prices[i - 1] > 0 ? prices[i] - prices[i - 1] : 0;
		}
		return profit;
	}

	public static void main(String[] args) {
		System.out.println(new BestTimeToBuyAndSellStockII().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
		System.out.println(new BestTimeToBuyAndSellStockII().maxProfit(new int[]{1, 2, 3, 4, 5}));
	}
}
