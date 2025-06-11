package com.leetcode.utils;
public class InvertBinaryTree {
   public TreeNode invertTree(TreeNode root) {
       if(root==null) return null;
       TreeNode tmp=null;
       tmp=root.left;
       root.left=root.right;
       root.right=tmp;
       invertTree(root.left);
       invertTree(root.right);
       return root;
    }
}
