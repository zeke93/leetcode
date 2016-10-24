package cn.hackcoder;

/**
 * Created by thinsky on 16-7-4.
 */
public class RotateArray {
    public void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotate(data, 3);
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }
    }

}
