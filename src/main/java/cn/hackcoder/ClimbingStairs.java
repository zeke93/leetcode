package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/2.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] results = new int[n + 2];
        results[1] = 1;
        results[2] = 2;
        for (int i = 3; i <= n; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }
        return results[n];
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(44));
    }
}
