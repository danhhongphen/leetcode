package com.leetcode.utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * This is a common data structure used in LeetCode problems.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Creates a binary tree from a level-order array representation.
     * null values in the array represent null nodes.
     * @param values Level-order array representation of the tree
     * @return Root of the created binary tree
     */
    public static TreeNode fromArray(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < values.length; i += 2) {
            TreeNode current = queue.poll();

            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.offer(current.left);
            }

            if (i + 1 < values.length && values[i + 1] != null) {
                current.right = new TreeNode(values[i + 1]);
                queue.offer(current.right);
            }
        }

        return root;
    }

    /**
     * Converts a binary tree to its level-order array representation.
     * @param root Root of the binary tree
     * @return Level-order array representation of the tree
     */
    public static Integer[] toArray(TreeNode root) {
        if (root == null) {
            return new Integer[0];
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        LinkedList<Integer> result = new LinkedList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                result.add(null);
                continue;
            }

            result.add(node.val);
            queue.offer(node.left);
            queue.offer(node.right);
        }

        // Remove trailing nulls
        while (result.size() > 0 && result.getLast() == null) {
            result.removeLast();
        }

        return result.toArray(new Integer[0]);
    }

    @Override
    public String toString() {
        return "TreeNode{" + val + "}";
    }
}
