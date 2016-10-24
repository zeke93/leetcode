package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/23.
 */
public class NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        System.out.println();new NimGame().canWinNim(4);
    }

}
