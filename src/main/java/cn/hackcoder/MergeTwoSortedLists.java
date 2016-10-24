package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/3.
 */
public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while (true) {
            if (l1 == null || l2 == null) break;
            if (l1.val <= l2.val) {
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new MergeTwoSortedLists().new ListNode(1);
        ListNode head = new MergeTwoSortedLists().mergeTwoLists(a1, null);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
