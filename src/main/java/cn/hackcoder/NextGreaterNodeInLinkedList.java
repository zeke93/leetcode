package cn.hackcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 1019. Next Greater Node In Linked List
 */
public class NextGreaterNodeInLinkedList {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public int[] nextLargerNodes(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}

		int[] res = new int[list.size()];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < list.size(); i++) {
			int val = list.get(i);
			while (!stack.isEmpty() && list.get(stack.peek()) < val) {
				res[stack.pop()] = val;
			}
			stack.push(i);
		}
		return res;
	}

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(7);
		ListNode listNode3 = new ListNode(5);
		ListNode listNode4 = new ListNode(1);
		ListNode listNode5 = new ListNode(9);
		ListNode listNode6 = new ListNode(2);
		ListNode listNode7 = new ListNode(5);
		ListNode listNode8 = new ListNode(1);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = listNode7;
		listNode7.next = listNode8;
		System.out.println(Arrays.toString(new NextGreaterNodeInLinkedList().nextLargerNodes(listNode1)));
	}

}
