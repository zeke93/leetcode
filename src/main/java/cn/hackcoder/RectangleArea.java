package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/17.
 */
public class RectangleArea {

    public int computeArea(int tx1, int ty1, int tx2, int ty2, int rx1, int ry1, int rx2, int ry2) {
        int total = (tx2 - tx1) * (ty2 - ty1) + (rx2 - rx1) * (ry2 - ry1);
        int common = 0;
        if (tx1 < rx1) tx1 = rx1;
        if (ty1 < ry1) ty1 = ry1;
        if (tx2 > rx2) tx2 = rx2;
        if (ty2 > ry2) ty2 = ry2;

        common = (tx2 - tx1) * (ty2 - ty1);
        if (tx1 > tx2 || ty1 > ty2) {
            common = 0;
        }
        return total - common;
    }

    public static void main(String[] args) {
        System.out.println(new RectangleArea().computeArea(-2, -2, 2, 2, 3, 3, 4, 4));
    }
}
