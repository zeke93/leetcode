package cn.hackcoder;

/**
 * Created by thinsky on 2017/7/31.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1 != null ? l1 : l2;//返回结果
        int carryFlag = 0;//进位
        ListNode last = null;//最后的结点
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val;
            l1.val = (val + carryFlag) % 10;
            carryFlag = (val + carryFlag) / 10;

            last = l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int val = (l1.val + carryFlag) % 10;
            carryFlag = (l1.val + carryFlag) / 10;
            l1.val = val;

            last.next = l1;
            last = l1;
            l1 = l1.next;
        }

        while (l2 != null) {
            int val = (l2.val + carryFlag) % 10;
            carryFlag = (l2.val + carryFlag) / 10;
            l2.val = val;

            last.next = l2;
            last = l2;
            l2 = l2.next;
        }

        if (carryFlag != 0) {
            last.next = new ListNode(carryFlag);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(9);
        ListNode l12 = new ListNode(8);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;


        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        ListNode result = new AddTwoNumbers().addTwoNumbers(l11, l21);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
