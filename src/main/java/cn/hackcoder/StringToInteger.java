package cn.hackcoder;

/**
 * Created by Thinsky on 16/4/17.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        str = str.trim();
        char[] c = str.toCharArray();
        if (c.length == 0) {
            return 0;
        }

        int i = 0;
        boolean isMinus = false;
        if (c[0] == '-') {
            isMinus = true;
            i++;
        } else if (c[0] == '+') {
            i++;
        } else if (!(c[0] >= '0' && c[0] <= '9')) {
            return 0;
        }
        long result = 0;
        while (i < c.length && c[i] >= '0' && c[i] <= '9') {
            result = result * 10 + c[i++] - '0';
            if (result >= Integer.MAX_VALUE) {
                if (isMinus) {
                    if (result > Integer.MAX_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return isMinus ? (int) (0 - result) : (int) result;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new StringToInteger().myAtoi("  -0012a42"));
    }
}
