package cn.hackcoder;

/**
 * Created by Thinsky on 16/4/17.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int flag = x > 0 ? 1 : -1;
        x = Math.abs(x);
        int result = 0;
        while (x > 0) {
            int pre = result;
            result = result * 10 + x % 10;
            if (pre != (result - x % 10) / 10) {
                return 0;
            }
            x = x / 10;
        }
        return flag * result;
    }


    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(new ReverseInteger().reverse(123));
        System.out.println(new ReverseInteger().reverse(-123));
        System.out.println(new ReverseInteger().reverse(1534236469));
    }
}
