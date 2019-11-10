package cn.hackcoder;

import java.util.Stack;

/**
 * #92. Reverse Linked List II
 */
public class ReverseLinkedListII {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode headTmp = head;
        ListNode preHead = null;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (head != null) {
            i++;
            if (i == m - 1) {
                preHead = head;
            }
            if (i >= m && i <= n) {
                stack.push(head.val);
            } else if (i > n) {
                break;
            }
            head = head.next;
        }

        ListNode nextNode = head;
        while (!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop());
            if (preHead == null) {
                preHead = node;
                headTmp = node;
            } else {
                preHead.next = node;
                preHead = preHead.next;
            }
        }
        preHead.next = nextNode;
        return headTmp;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = new ReverseLinkedListII().reverseBetween(node1, 1, 4);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
