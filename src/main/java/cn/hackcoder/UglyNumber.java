package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/2.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num == 0) return false;
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        if (num == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new UglyNumber().isUgly(905391974));
    }
}
