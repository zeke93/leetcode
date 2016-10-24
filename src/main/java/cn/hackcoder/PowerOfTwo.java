package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/3.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        double num = n;
        while (num >= 2) {
            if (num % 2 != 0) return false;
            num /= 2;
        }
        return num == 1;
    }
}
