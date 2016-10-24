package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/26.
 */
public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode p = head;
        ListNode q = head.next;
        head.next = null;
        while (q != null) {
            ListNode r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        head = p;
        return head;
    }

    public static void main(String[] args) {

    }
}
