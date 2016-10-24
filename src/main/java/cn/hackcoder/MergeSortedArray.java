package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/17.
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n, p1 = m - 1, p2 = n - 1;
        while (--p >= 0) {
            if ((p2 < 0) || (p1 >= 0 && nums1[p1] >= nums2[p2])) {
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = new int[0];
        new MergeSortedArray().merge(nums1, 1, nums2, 0);
    }
}
