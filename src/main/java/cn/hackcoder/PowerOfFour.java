package cn.hackcoder;

/**
 * Created by Thinsky on 16/4/20.
 */
public class PowerOfFour {
    public static boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (Integer.bitCount(num - 1) & 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(8));
        System.out.println(isPowerOfFour(256));
    }

}
