package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/5.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        return n>=5 ? n/5 + trailingZeroes(n/5): 0;
    }

    public static void main(String[] args) {
        System.out.println(new FactorialTrailingZeroes().trailingZeroes(10));
    }
}
