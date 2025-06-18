package com.leetcode.Tries;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PrefixTree {
    private TriesNode root;

    public PrefixTree() {
         root = new TriesNode();
    }

    public void insert(String word) {
        if (word == null) {
            return;
        }

        TriesNode rootNode = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.toCharArray()[i];
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("Word must contain only lowercase letters a-z");
            }
            int index = c - 'a';
            if (rootNode.getTriesNodes()[index] == null) {
                rootNode.getTriesNodes()[index] = new TriesNode();
            }
            rootNode = rootNode.getTriesNodes()[index];
        }
        rootNode.isEndOfWord = true;
    }

    public boolean search(String word) {
        if (word == null) {
            return false;
        }

        TriesNode rootNode = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.toCharArray()[i];
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("Word must contain only lowercase letters a-z");
            }
            int index = c - 'a';
            if (rootNode.getTriesNodes()[index] == null) {
                return false;
            }
            if (rootNode.getTriesNodes()[index].isEndOfWord && i == word.length() - 1) {
                return true;
            }
            rootNode = rootNode.getTriesNodes()[index];
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        TriesNode rootNode = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.toCharArray()[i];
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("Word must contain only lowercase letters a-z");
            }
            int index = c - 'a';
            if (rootNode.getTriesNodes()[index] == null) {
                return false;
            }
            rootNode = rootNode.getTriesNodes()[index];
        }
        return true;
    }

    class TriesNode {
        private TriesNode[] triesNodes = new TriesNode[26];
        private boolean isEndOfWord;

        public TriesNode() {
        }

        public TriesNode(boolean isEndOfWord) {
            this.isEndOfWord = isEndOfWord;
        }

        public TriesNode[] getTriesNodes() {
            return triesNodes;
        }

        public void setTriesNodes(TriesNode[] triesNodes) {
            this.triesNodes = triesNodes;
        }
    }
}