package cn.hackcoder;

import java.util.Random;

/**
 * Created by linzhichao on 16/10/24.
 */
public class MinimumPathSum {
    /**
     * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right
     * which minimizes the sum of all numbers along its path.
     * Note: You can only move either down or right at any point in time.
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        return 0;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] grid = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = random.nextInt(10);
                System.out.println(grid[i][j] + "   ");
            }
            System.out.println();
        }

        new MinimumPathSum().minPathSum(grid);
    }

}
