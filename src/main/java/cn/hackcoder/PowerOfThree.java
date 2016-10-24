package cn.hackcoder;

/**
 * 326
 * Created by Thinsky on 16/1/26.
 */
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        double num = n;
        while (num >= 3) {
            num /= 3;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println("" + isPowerOfThree(27));
        System.out.println(Math.pow(3, 4));
    }
}
