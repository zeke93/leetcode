package cn.hackcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Thinsky on 16/3/1.
 */
public class RemoveDuplicatesFromSortedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode root = head;
        ListNode pre = head;
        ListNode now = head.next;
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        while (now != null) {
            if (!set.add(now.val)) {
                pre.next = now.next;
                now = now.next;
            } else {
                pre = now;
                now = now.next;
            }

        }
        return root;
    }

    public static void main(String[] args) {

    }

}
