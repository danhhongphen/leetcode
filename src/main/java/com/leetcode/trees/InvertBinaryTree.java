package com.leetcode.trees;

import com.leetcode.utils.TreeNode;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        return invertTreeRecurse(root);
    }

    private static TreeNode invertTreeRecurse(TreeNode currentNode) {
        if (currentNode == null) {
            return null;
        }

        TreeNode leftNode = currentNode.left;
        TreeNode rightNode = currentNode.right;

        currentNode.left = rightNode;
        currentNode.right = leftNode;
        invertTreeRecurse(rightNode);
        invertTreeRecurse(leftNode);
        return currentNode;
    }
}
