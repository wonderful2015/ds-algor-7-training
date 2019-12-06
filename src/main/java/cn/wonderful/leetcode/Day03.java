package main.java.cn.wonderful.leetcode;

/**
 * @ClassName Day03
 * @Description
 * @Author wdf
 * @Date 2019-12-06
 **/


public class Day03 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode mergedListNode = preHead;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                mergedListNode.next = l1;
                l1 = l1.next;
            } else {
                mergedListNode.next = l2;
                l2 = l2.next;
            }
            mergedListNode = mergedListNode.next;
        }

        mergedListNode.next = l1 == null ? l2 : l1;

        return preHead.next;
    }

}
