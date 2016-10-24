package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/23.
 */
public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        int A = 0;
        int B = 0;
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                ++A;
            } else {
                ++a[secret.charAt(i) - '0'];
                ++b[guess.charAt(i) - '0'];
            }
        }

        for (int i = 0; i < 10; i++) {
            B += Math.min(a[i], b[i]);
        }
        return A + "A" + B + "B";
    }


    public static void main(String[] args) {
        System.out.println(getHint("00112233445566778899", "16872590340158679432"));
    }
}
