package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/25.
 */
public class AddBinary {
    public String addBinary(String a, String b) {

        String sum = "";
        int n = a.length();
        int m = b.length();
        int minLength = Math.min(n, m);
        int flag = 0;
        for (int i = 0; i < minLength; i++) {
            int x = a.charAt(a.length() - 1 - i) - '0';
            int y = b.charAt(b.length() - 1 - i) - '0';
            int s = x + y + flag;
            if (s >= 2) {
                sum = s / 3 + sum;
                flag = 1;
            } else {
                sum = s + sum;
                flag = 0;
            }
        }
        if (n > minLength) {
            while (n - minLength > 0) {
                int x = a.charAt(a.length() - 1 - minLength++) - '0';
                int s = x + flag;
                if (s >= 2) {
                    sum = s / 3 + sum;
                    flag = 1;
                } else {
                    sum = s + sum;
                    flag = 0;
                }
            }
        }
        if (m > minLength) {
            while (m - minLength > 0) {
                int x = b.charAt(b.length() - 1 - minLength++) - '0';
                int s = x + flag;
                if (s >= 2) {
                    sum = s / 3 + sum;
                    flag = 1;
                } else {
                    sum = s + sum;
                    flag = 0;
                }
            }
        }
        return flag == 0 ? sum : 1 + sum;
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("11", "11111"));
    }
}
