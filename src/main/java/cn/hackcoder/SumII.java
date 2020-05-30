package cn.hackcoder;

import java.util.Arrays;

/**
 * 454. 4Sum II
 */
public class SumII {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		Arrays.sort(D);

		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				for (int k = 0; k < C.length; k++) {
					for (int l = 0; l < D.length; l++) {
						int sum = A[i] + B[j] + C[l] + D[l];
						if (sum == 0) count++;
						if (sum < 0) break;
					}
				}
			}
		}
		return count;
	}
}
