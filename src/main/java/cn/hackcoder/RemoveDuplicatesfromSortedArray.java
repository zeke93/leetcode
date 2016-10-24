package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/4.
 */
public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        int slow = 0, fast = 1, n = nums.length;
        while (fast < n) {
            if (nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }


    public static void main(String[] args) {
        new RemoveDuplicatesfromSortedArray().removeDuplicates(new int[]{1, 2, 2, 3, 4, 4});
    }
}
