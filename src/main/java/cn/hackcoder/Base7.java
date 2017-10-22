package cn.hackcoder;

/**
 * Created by linzhichao on 2017/10/22.
 */
public class Base7 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        System.out.println(new Base7().convertToBase7(100));
        System.out.println(new Base7().convertToBase7(-7));
    }
}
