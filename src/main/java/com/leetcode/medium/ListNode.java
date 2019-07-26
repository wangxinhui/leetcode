package com.leetcode.medium;

/**
 * @Author: by simple on 2018/11/15.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x ){
        val = x;
    }


}

class Solution{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode first = dummyHead;
        int remainder = 0;
        while (l1!=null || l2!=null){
            int x = (l1==null) ? 0 : l1.val;
            int y = (l2==null) ? 0 : l2.val;
            int res = x + y + remainder;
            remainder = res/10;
            first.next = new ListNode(res%10);
            first = first.next;
            if (l1!=null)
            l1 = l1.next;
            if (l2!=null)
            l2 = l2.next;
        }
        return dummyHead.next;
    }
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        listNode1.next = listNode2;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode5.next = listNode6;
        listNode4.next = listNode5;

        ListNode listNode = addTwoNumbers(listNode1,listNode4);
        System.out.println(listNode);
    }
}
