package com.leetcode.two.pointer;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if(s.length() == 1) {
            return false;
        }

        int limit2 = s.length() % 2 == 0 ? s.length()/2 : s.length()/2+1;
        for (int i = 0, j = s.length()-1; i <= limit2; i++, j-- ) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("abcdba"));
    }
}
