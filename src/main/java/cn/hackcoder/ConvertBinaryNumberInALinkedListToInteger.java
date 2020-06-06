package cn.hackcoder;

import java.util.Stack;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 */
public class ConvertBinaryNumberInALinkedListToInteger {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public int getDecimalValue(ListNode head) {
		Stack<Integer> stack = new Stack<>();
		while (head != null) {
			stack.push(head.val);
			head = head.next;
		}
		int res = 0;
		int i = 0;
		while (!stack.isEmpty()) {
			res += Math.pow(2, i++) * stack.pop();
		}
		return res;
	}
}
