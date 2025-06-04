package com.leetcode.arrays;

public class ValidPalindrome_Ti {
    // Method1: Myself
    // [^] --> means if not some value in square bracket
    public boolean isPalindrome(String s) {
        // validate input s = null -> line 9 throw null pointer exception

        String regex = "[^a-zA-z0-9]";
        s = s.trim().toLowerCase().replaceAll(regex, ""); // Không nên thay đổi input -> tạo biến mơ
        System.out.println("String s after being preprocessed: " + s);
        int sLength = s.length();
        System.out.println("String sLength after being preprocessed: " + sLength);
        for (int i = 0; i < (sLength / 2); ++i) {
            if (s.charAt(i) != s.charAt(sLength - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method2: (after watching hint in leetcode)
    public boolean isPalindrome_2(String s) {
        String regex = "[^a-zA-z0-9]";
        s = s.trim().toLowerCase().replaceAll(regex, "");
        int sLength = s.length();
        int currentStart = 0;
        int currentEnd = sLength - 1;
        while (currentStart <= currentEnd){
            if (s.charAt(currentStart) != s.charAt(currentEnd)){
                return false;
            }
            ++currentStart;
            --currentEnd;
        }
        return true;
    }

    // Method3: Cool =))))
    // Idea: Valid Palindrome means the reverse preprocessed string equals to the initial preprocess string
    // StringBuffer --> object for handling string (mutable string) --> add, delete, edit without creating new object
    // String --> is immutable
    public boolean isPalindrome_3(String s) {
        String regex = "[^a-zA-z0-9]";
        String preprocessed = s.trim().toLowerCase().replaceAll(regex, "");
        String rev = new StringBuffer(preprocessed).reverse().toString(); // why we must have toString() method here although rev is string ?
        if (rev.equals(preprocessed)){
            return true;
        }
        else{
            return false;
        }

    }


    public static void main(String []args){
        ValidPalindrome_Ti sol = new ValidPalindrome_Ti();

        String s1 = "H";
        System.out.println("s1: " + sol.isPalindrome(s1)); // true
        System.out.println("s1: " + sol.isPalindrome_2(s1)); // true
        System.out.println("s1: " + sol.isPalindrome_3(s1)); // true
        String s2 = "Was it a car or a cat I saw?";
        System.out.println("s2: " + sol.isPalindrome(s2)); // true
        System.out.println("s2: " + sol.isPalindrome_2(s2)); // true
        System.out.println("s2: " + sol.isPalindrome_3(s2)); // true
        String s3 = "tab a cat";
        System.out.println("s3: " + sol.isPalindrome(s3)); // false
        System.out.println("s3: " + sol.isPalindrome_2(s3)); // false
        System.out.println("s3: " + sol.isPalindrome_3(s3)); // false
        String s4 = "Was it a car or a cat I saw?";
        System.out.println("s4: " + sol.isPalindrome(s4)); // true
        System.out.println("s4: " + sol.isPalindrome_2(s4)); // true
        System.out.println("s4: " + sol.isPalindrome_3(s4)); // true
        String s5 = "tab@@@ a# cat&*)*^[]+-*/~`(&()*&";
        System.out.println("s5: " + sol.isPalindrome(s5)); // false
        System.out.println("s5: " + sol.isPalindrome_2(s5)); // false
        System.out.println("s5: " + sol.isPalindrome_3(s5)); // false


    }
}
