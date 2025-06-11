package com.leetcode.trees;

import com.leetcode.linkedlist.ReverseLinkedList;
import com.leetcode.utils.ListNode;
import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InvertBinaryTreeTest {
    @Test
    void invertBinaryTreeTest1() {
        Integer[] listNode = {1, 2, 3, 4, 5, 6, 7};

        TreeNode treeNode = TreeNode.fromArray(listNode);
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode invertTree = invertBinaryTree.invertTree(treeNode);

        Integer[] expectListNode = {1,3,2,7,6,5,4};

        System.out.println(invertTree);
        assertArrayEquals(TreeNode.toArray(invertTree), expectListNode);
    }
}
