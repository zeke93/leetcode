package cn.hackcoder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 148. Sort List
 */
public class SortList {
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


	public ListNode sortList(ListNode head) {
		if (head == null) return null;
		List<ListNode> listNodes = new ArrayList<>();
		while (head != null) {
			listNodes.add(head);
			ListNode pNext = head.next;
			head.next = null;
			head = pNext;
		}

		listNodes.sort(Comparator.comparingInt(o -> o.val));
		ListNode pHead = listNodes.get(0);
		ListNode preNode = pHead;
		for (int i = 1; i < listNodes.size(); i++) {
			preNode.next = listNodes.get(i);
			preNode = listNodes.get(i);
		}
		return pHead;
	}
}
