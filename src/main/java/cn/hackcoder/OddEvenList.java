package cn.hackcoder;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OddEvenList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode result = new ListNode(-1);
        ListNode copyResult = result;
        ListNode evenHead = new ListNode(-1);
        ListNode copyEvenHead = evenHead;
        int i = 1;
        while (head != null) {
            if (i++ % 2 == 1) {
                result.next = head;
                result = result.next;
            } else {
                evenHead.next = head;
                evenHead = evenHead.next;
            }
            head = head.next;
        }
        evenHead.next = null;
        result.next = copyEvenHead.next;
        return copyResult.next;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        input = input.substring(1, input.length() - 1);
        List<String> numbers = Arrays.asList(input.split(","));
        ListNode head = null;
        ListNode pHead = null;
        for (String number : numbers) {
            ListNode node = new ListNode(Integer.parseInt(number));
            if (head == null) {
                pHead = head = node;
            } else {
                head.next = node;
                head = head.next;
            }
        }
        pHead = oddEvenList(pHead);
        while (pHead != null) {
            System.out.println(pHead.val);
            pHead = pHead.next;
        }
    }
}
