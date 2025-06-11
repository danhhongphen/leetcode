package com.leetcode.linkedlist;

import com.leetcode.utils.ListNode;

public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prevNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextTemp = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextTemp;
        }

        return prevNode;
    }
}
