package cn.hackcoder;

/**
 * Created by linzhichao on 2017/10/22.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) return true;
            if (i * i > num) return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare().isPerfectSquare(16));
        System.out.println(new ValidPerfectSquare().isPerfectSquare(14));
    }
}
