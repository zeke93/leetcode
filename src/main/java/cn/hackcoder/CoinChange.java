package cn.hackcoder;

/**
 * 322. Coin Change
 */
public class CoinChange {

	public int coinChange(int[] coins, int amount) {
		if (amount == 0) return 0;
		if (amount < 0) return -1;
		int[] dp = new int[amount + 1];

		for (int i = 0; i <= amount; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		for (int i = 1; i <= amount; i++) {
			int min = dp[i];
			for (int coin : coins) {
				if (i - coin < 0 || dp[i - coin] == Integer.MAX_VALUE) continue;
				min = Math.min(min, 1 + dp[i - coin]);
			}
			dp[i] = min;
		}
		return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
	}

	public static void main(String[] args) {
		System.out.println(new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
		System.out.println(new CoinChange().coinChange(new int[]{2}, 3));
		System.out.println(new CoinChange().coinChange(new int[]{2, 3, 4}, 12));
	}
}
