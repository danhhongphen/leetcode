package com.leetcode.linkedlist;

import com.leetcode.arrays.ContainsDuplicate;
import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseLinkedListTest {

    @Test
    void revertLinkedListTest1() {
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);


        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reverseList = reverseLinkedList.reverseList(node0);
        System.out.println(reverseList);
        assertArrayEquals(new int[]{4, 3, 2, 1, 0}, listToArray(reverseList));
    }

    private int[] listToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
