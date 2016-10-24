package cn.hackcoder;

/**
 * Created by Thinsky on 16/3/23.
 */
public class RemoveNthNodeFromEndofList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preNode = head;
        int sum = 0;
        while (preNode != null) {
            sum++;
            preNode = preNode.next;
        }
        if (sum == 1){
            return null;
        }
        if (sum == n){
            head = head.next;
            return head;
        }
        preNode = head;
        for (int i = 0; i < sum - n -1; i++) {
            preNode = preNode.next;
        }
        preNode.next = preNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        p1.next = p2;
        removeNthFromEnd(p1,2);
    }
}
