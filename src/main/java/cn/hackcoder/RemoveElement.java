package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/4.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int num : nums) {
            if (num != val) {
                nums[length++] = num;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{4, 5}, 4));
    }
}
