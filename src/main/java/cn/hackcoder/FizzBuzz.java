package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linzhichao on 2017/8/31.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz";
            s = s.equals("") ? "" + i : s;
            result.add(s);
        }
        return result;
    }

    public static void main(String[] args) {
        for (String s : new FizzBuzz().fizzBuzz(15)) {
            System.out.println(s);
        }
    }
}
