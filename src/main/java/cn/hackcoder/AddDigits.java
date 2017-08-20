package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/23.
 */
public class AddDigits {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigits(1234));
    }
}
