package cn.hackcoder;

/**
 * Created by thinsky on 16-6-23.
 */
public class SwapNodesInPairs {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode pHead = head;
        while (head != null && head.next != null) {
            int temp = head.next.val;
            head.next.val = head.val;
            head.val = temp;
            head = head.next.next;
        }
        return pHead;
    }
}
