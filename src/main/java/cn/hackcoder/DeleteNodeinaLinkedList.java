package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/23.
 */
public class DeleteNodeinaLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        if (node != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }


}
