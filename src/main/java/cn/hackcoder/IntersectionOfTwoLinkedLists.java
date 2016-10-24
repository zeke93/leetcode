package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/11.
 */
public class IntersectionOfTwoLinkedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = length(headA);
        int lB = length(headB);
        int lmin = Math.min(lA, lB);
        ListNode hA = headA;
        ListNode hB = headB;

        while(lA-- > lmin) hA = hA.next;
        while(lB-- > lmin) hB = hB.next;
        while(hA != null) {
            if(hA == hB) return hA;
            hA = hA.next;
            hB = hB.next;
        }

        return null;
    }

    public int length(ListNode head) {
        int len = 0;
        ListNode node = head;
        while(node != null) {
            len++;
            node = node.next;
        }

        return len;
    }

}
