package cn.hackcoder;

import java.util.Random;

/**
 * 64. Minimum Path Sum
 */
public class MinimumPathSum {

	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] map = new int[m][n];
		map[0][0] = grid[0][0];
		for (int i = 1; i < m; i++) {
			map[i][0] = map[i - 1][0] + grid[i][0];
		}
		for (int j = 1; j < n; j++) {
			map[0][j] = map[0][j - 1] + grid[0][j];
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				map[i][j] = Math.min(map[i - 1][j], map[i][j - 1]) + grid[i][j];
			}
		}
		return map[m - 1][n - 1];
	}

	public static void main(String[] args) {
		int n = 4;
		int[][] grid = new int[n][n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = random.nextInt(3);
				System.out.print(grid[i][j] + "   ");
			}
			System.out.println();
		}

		System.out.println(new MinimumPathSum().minPathSum(grid));
	}

}
