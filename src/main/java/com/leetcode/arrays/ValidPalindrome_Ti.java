package com.leetcode.arrays;

public class ValidPalindrome_Ti {
    public boolean isPalindrome(String s) {
        String regex = "[^a-zA-z0-9]";
        s = s.trim().toLowerCase().replaceAll(regex, "");
        System.out.println("String s after being preprocessed: " + s);
        int sLength = s.length();
        System.out.println("String sLength after being preprocessed: " + sLength);
        for (int i = 0; i < (sLength / 2); ++i){
            if (s.charAt(i) != s.charAt(sLength - i - 1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        ValidPalindrome_Ti sol = new ValidPalindrome_Ti();

        String s1 = "H";
        System.out.println("s1: " + sol.isPalindrome(s1)); // true
        String s2 = "Was it a car or a cat I saw?";
        System.out.println("s2: " + sol.isPalindrome(s2)); // true
        String s3 = "tab a cat";
        System.out.println("s3: " + sol.isPalindrome(s3)); // false
        String s4 = "Was it a car or a cat I saw?";
        System.out.println("s4: " + sol.isPalindrome(s4)); // true
        String s5 = "tab@@@ a# cat&*)*^[]+-*/~`(&()*&";
        System.out.println("s5: " + sol.isPalindrome(s5)); // false


    }
}
