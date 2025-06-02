package com.leetcode.utils;

/**
 * Definition for singly-linked list node.
 * This is a common data structure used in LeetCode problems.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * Creates a linked list from an array of values.
     * @param values Array of integers to create the linked list from
     * @return Head of the created linked list
     */
    public static ListNode fromArray(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    /**
     * Converts a linked list to an array.
     * @param head Head of the linked list
     * @return Array representation of the linked list
     */
    public static int[] toArray(ListNode head) {
        // Count the number of nodes
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Create and populate the array
        int[] result = new int[count];
        current = head;
        for (int i = 0; i < count; i++) {
            result[i] = current.val;
            current = current.next;
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        
        return sb.toString();
    }
}
