package cn.hackcoder;

/**
 * Created by linzhichao on 2017/9/12.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(1,4));
    }
}
