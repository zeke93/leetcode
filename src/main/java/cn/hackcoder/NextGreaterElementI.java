package cn.hackcoder;

import java.util.Stack;

/**
 * Created by linzhichao on 2017/8/8.
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            stack.push(nums[i]);
        }

        int[] result = new int[findNums.length];
        int i = 0;
        for (int findNum : findNums) {
            result[i++] = findGreater(findNum, stack);
        }
        return result;
    }

    int findGreater(int findNum, Stack<Integer> stack) {
        Stack<Integer> stackClone = (Stack<Integer>) stack.clone();
        boolean isFindNum = false;
        while (!stackClone.isEmpty()) {
            int num = stackClone.pop();
            if (num == findNum) {
                isFindNum = true;
            }
            if (isFindNum && num > findNum) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        for (int num : new NextGreaterElementI().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})) {
            System.out.println(num);
        }
    }
}
