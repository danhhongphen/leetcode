package com.leetcode.arrays;

import com.sun.source.tree.Tree;

public class InvertBinary_Ti {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        // swap left and right children node
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // recursive it on left and right subtrees
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
