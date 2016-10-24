package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/25.
 */
public class PalindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode pNode = head;
        int length = 0;
        while (pNode != null) {
            pNode = pNode.next;
            ++length;
        }
        pNode = head;
        for (int i = 0; i < length / 2; i++) {
            pNode = pNode.next;
        }
        ListNode reverseHead = reverseList(pNode);
        for (int i = 0; i < length / 2; i++) {
            if (head.val != reverseHead.val) return false;
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    public ListNode reverseList(final ListNode head) {
        if (head == null) return null;
        ListNode p = head;
        ListNode q = head.next;
        head.next = null;
        ListNode r = null;
        while (q != null) {
            r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(1);
        ListNode p3 = new ListNode(2);
        ListNode p4 = new ListNode(1);
        ListNode p5 = new ListNode(1);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        System.out.println(new PalindromeLinkedList().isPalindrome(p1));
    }
}
