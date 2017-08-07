package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/5.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int flag = 1;//进位标志
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + flag >= 10) {
                digits[i] = (digits[i] + flag) % 10;
                flag = 1;
            } else {
                digits[i] = (digits[i] + flag) % 10;
                flag = 0;
            }
        }

        if (flag == 1) {
            int[] results = new int[digits.length + 1];
            results[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                results[i + 1] = digits[i];
            }
            return results;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        for (int i : new PlusOne().plusOne(new int[]{9, 9})) {
            System.out.println(i);
        }
    }
}
