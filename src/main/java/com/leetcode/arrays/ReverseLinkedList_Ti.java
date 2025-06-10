package com.leetcode.arrays;

import java.util.Stack;

public class ReverseLinkedList_Ti {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /*
        Y tuong cua em la:
        + Do cai linkedlist vao cai stack, cai head se thanh cai tail va cai tail se thanh head (LIFO)
        + Nay la em nghi ra la em code luon, em se coi cac cach khac de code cho quen voi lai toi uu hon
        + Co gi toi em update tiep kkkk.
    * */
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        // put Node to Stack
        Stack<Integer> numberStack = new Stack<>();
        ListNode currNode = head;
        while(currNode != null){
            numberStack.push(currNode.val);
            currNode = currNode.next;
        }
        // head is still head but the val inside this Node is change
        currNode = head;
        while(!numberStack.isEmpty()){
            currNode.val = numberStack.pop();
            currNode = currNode.next;
        }
        return head;
    }

    public ListNode createLinkedListFromArray(int[] arr){
        if (arr == null || arr.length == 0){
            return null;
        }
        ListNode head = new ListNode(-1);
        ListNode currNode = head;
        for (int i : arr){
            currNode.next = new ListNode(i);
            currNode = currNode.next;
        }
        return head.next;
    }

    public void printList(ListNode head){
        ListNode currNode = head;
        while (currNode != null){
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        ReverseLinkedList_Ti sol = new ReverseLinkedList_Ti();
        int[] nums1 = {0,1,2,3};
        ListNode head1 = sol.createLinkedListFromArray(nums1);
        head1 = sol.reverseList(head1);
        sol.printList(head1);

        int[] nums2 = {};
        ListNode head2 = sol.createLinkedListFromArray(nums2);
        head2 = sol.reverseList(head2);
        sol.printList(head2);
    }
}
