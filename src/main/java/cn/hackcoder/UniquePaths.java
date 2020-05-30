package cn.hackcoder;

/**
 * 62. Unique Paths
 */
public class UniquePaths {

	private int paths = 0;

	private void move(int x, int y, int targetX, int targetY) {
		if (x > targetX || y > targetY) return;
		if (x == targetX && y == targetY) {
			paths++;
			return;
		}
		//Right
		move(x, y + 1, targetX, targetY);
		//Down
		move(x + 1, y, targetX, targetY);
	}

	public int uniquePaths(int m, int n) {
		int[][] map = new int[m][n];
		for (int i = 0; i < m; i++) {
			map[i][0] = 1;
		}
		for (int j = 0; j < n; j++) map[0][j] = 1;

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				map[i][j] = map[i - 1][j] + map[i][j - 1];
			}
		}
		return map[m - 1][n - 1];
	}


	public static void main(String[] args) {
		System.out.println(new UniquePaths().uniquePaths(3, 1));
		System.out.println(new UniquePaths().uniquePaths(3, 2));
		System.out.println(new UniquePaths().uniquePaths(3, 3));
		System.out.println(new UniquePaths().uniquePaths(3, 4));
		System.out.println(new UniquePaths().uniquePaths(3, 5));
		System.out.println(new UniquePaths().uniquePaths(3, 6));
		System.out.println(new UniquePaths().uniquePaths(3, 7));
	}
}
