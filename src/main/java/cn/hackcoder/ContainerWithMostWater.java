package cn.hackcoder;

/**
 * Created by Thinsky on 16/4/20.
 */

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such that the container contains the most water.
 * <p/>
 * Note: You may not slant the container.
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1, leftHeight = height[left], rightHeight = height[right];
        while (left < right) {
            int area = Math.min(leftHeight, rightHeight) * (right - left);
            if (area > max) max = area;
            if (leftHeight < rightHeight) {
                while (left < right && height[left] <=leftHeight) {
                    left++;
                }
                if (left < right) {
                    leftHeight = height[left];
                }
            } else {
                while (left < right && height[right] <= rightHeight) {
                    right--;
                }
                if (left < right) {
                    rightHeight = height[right];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,2,4,3}));
    }
}
