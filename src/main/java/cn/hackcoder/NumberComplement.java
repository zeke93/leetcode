package cn.hackcoder;

/**
 * Created by linzhichao on 2017/9/8.
 */
public class NumberComplement {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                result += Math.pow(2, s.length() - 1 - i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new NumberComplement().findComplement(5));
        System.out.println(new NumberComplement().findComplement(1));
        System.out.println(new NumberComplement().findComplement(2));
    }
}
