package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thinsky on 16/3/2.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        List<Integer> facts = new ArrayList<>();
        if (n == 1) return true;
        while (n > 0) {
            facts.add(n % 10);
            n /= 10;
        }
        int result = 0;
        for (int fact : facts) {
            result += fact * fact;
        }
        if (result < 10 && result != 1) {
            return false;
        }
        return isHappy(result);
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(4));
    }
}
