package cn.hackcoder;

/**
 * Created by linzhichao on 2017/8/30.
 */
public class Matrix {
    public int[][] updateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int colums = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (matrix[i][j] == 1) {
                    int distance = Integer.MAX_VALUE;
                    for (int p = 0; p < rows; p++) {
                        for (int q = 0; q < colums; q++) {
                            if ((p != i || q != j) && matrix[p][q] == 0) {
                                distance = Math.min(distance, Math.abs(i - p) + Math.abs(j - q));
                            }
                        }
                    }
                    if (distance != Integer.MAX_VALUE) matrix[i][j] = distance;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
//        for (int[] ints : new Matrix().updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}})) {
//            for (int i : ints) {
//                System.out.print(i + "\t");
//            }
//            System.out.println();
//        }
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 2);

    }
}
