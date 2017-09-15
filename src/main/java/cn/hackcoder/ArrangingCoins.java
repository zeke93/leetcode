package cn.hackcoder;

/**
 * Created by linzhichao on 2017/9/16.
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2L * n + 1.0 / 4) - 1.0 / 2);
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new ArrangingCoins().arrangeCoins(1804289383));
        System.out.println(new ArrangingCoins().arrangeCoins(5));
        System.out.println(new ArrangingCoins().arrangeCoins(8));
    }
}
