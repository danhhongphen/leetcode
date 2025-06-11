package com.leetcode.twoPointer;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        String strRemoveSpace = s.replaceAll("[^a-zA-Z0-9]", "");
        strRemoveSpace = strRemoveSpace.toLowerCase();

        for (int i = 0, j = strRemoveSpace.length() - 1; ; i++, j--) {
            if (i >= j) {
                return true;
            }
            if (strRemoveSpace.charAt(i) != strRemoveSpace.charAt(j)) {
                return false;
            }
        }
    }
}
