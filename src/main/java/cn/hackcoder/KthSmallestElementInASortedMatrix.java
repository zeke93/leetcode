package cn.hackcoder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 378. Kth Smallest Element in a Sorted Matrix
 */
public class KthSmallestElementInASortedMatrix {
	public int kthSmallest(int[][] matrix, int k) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				list.add(matrix[i][j]);
			}
		}
		list.sort(Comparator.comparingInt(o -> o));
		return list.get(k - 1);
	}

	public static void main(String[] args) {
//		int[][] a = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
		int[][] a = {{1, 2}, {1, 3}};
		System.out.println(new KthSmallestElementInASortedMatrix().kthSmallest(a, 2));
	}
}
