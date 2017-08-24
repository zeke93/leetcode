package cn.hackcoder;

/**
 * Created by linzhichao on 2017/8/24.
 */
public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int[][] results = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int num = 0;
                int sum = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int f = j - 1; f <= j + 1; f++) {
                        if (k >= 0 && f >= 0 && k < M.length && f < M[0].length) {
                            num++;
                            sum += M[k][f];
                        }
                    }
                }
                results[i][j] = sum / num;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[][] M = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] results = new ImageSmoother().imageSmoother(M);
        for (int[] result : results) {
            for (int i : result) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
