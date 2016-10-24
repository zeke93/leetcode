package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/24.
 */
public class RemoveLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(Integer.MAX_VALUE);
        pre.next = head;
        ListNode result = pre;
        ListNode now = head;
        while (now != null) {
            if (now.val == val) {
                pre.next = now.next;
                now = pre.next;
            } else {
                pre = pre.next;
                now = now.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        p1.next = p2;
        ListNode head = removeElements(p1, 1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
