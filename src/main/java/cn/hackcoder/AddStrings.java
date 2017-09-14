package cn.hackcoder;

/**
 * Created by linzhichao on 2017/9/15.
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        int maxLength = num1.length() >= num2.length() ? num1.length() : num2.length();
        String result = "";
        int flag = 0;
        for (int i = 0; i < maxLength; i++) {
            if (num1.length() - i - 1 >= 0 && num2.length() - i - 1 >= 0) {
                int s = flag + num1.charAt(num1.length() - i - 1) - '0' + num2.charAt(num2.length() - i - 1) - '0';
                flag = s >= 10 ? 1 : 0;
                result += s % 10;
            } else if (num1.length() - i - 1 < 0) {
                int s = flag + num2.charAt(num2.length() - i - 1) - '0';
                flag = s >= 10 ? 1 : 0;
                result += s % 10;
            } else if (num2.length() - i - 1 < 0) {
                int s = flag + num1.charAt(num1.length() - i - 1) - '0';
                flag = s >= 10 ? 1 : 0;
                result += s % 10;
            }
        }
        if (flag > 0) result += flag;
        return new StringBuilder(result).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("1212", "123"));
        System.out.println(new AddStrings().addStrings("9", "99"));
        System.out.println(new AddStrings().addStrings("6913259244", "71103343"));
//        new AddStrings().addStrings("6913259244", "71103343");
    }
}
