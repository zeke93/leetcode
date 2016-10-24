package cn.hackcoder;

/**
 * Created by Thinsky on 16/4/12.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortedArray = new int[nums1.length + nums2.length];
        int index = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                sortedArray[index++] = nums1[i++];
            } else {
                sortedArray[index++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            sortedArray[index++] = nums1[i++];
        }
        while (j < nums2.length) {
            sortedArray[index++] = nums2[j++];
        }
        int length = (nums1.length + nums2.length);
        return length % 2 == 0 ? (sortedArray[length / 2] + sortedArray[length / 2 - 1]) / 2.0 : sortedArray[length / 2];
    }

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {2, 3};
        System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(num1, num2));
    }
}
