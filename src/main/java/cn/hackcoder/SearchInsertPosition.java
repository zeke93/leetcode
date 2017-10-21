package cn.hackcoder;


/**
 * Created by linzhichao on 2017/10/21.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (int num : nums) {
            if (num == target) return i;
            else if (target < num) return i;
            i++;
        }
        return nums.length ;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
