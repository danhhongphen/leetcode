package com.leetcode.arrays;

public class Palindrome_Tan {
    // So sánh đầu cuối
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] array = s.toCharArray();
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // Đảo chuỗi và so sánh 
    public static boolean isPalindrome1(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    // Lưu thêm 1 mảng khác từ dưới lên và so sánh
    public static boolean isPalindrome2(String s) {
    s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    int n = s.length();
    char[] original = s.toCharArray();
    char[] reversed = new char[n];

    for (int i = 0; i < n; i++) {
        reversed[i] = original[n - 1 - i];
    }
    for (int i = 0; i < n; i++) {
        if (original[i] != reversed[i]) {
            return false;
        }
    }
    return true;
}
 public static void main(String[] args) {
        String[] testCases = {
            "Was it a car or a cat I saw?",
            "tab a cat",
            "",
            "A man, a plan, a canal: Panama",
            "No lemon, no melon",
        };

        for (String s : testCases) {
            System.out.println("Check: " + s);
            System.out.println("isPalindrome     : " + isPalindrome(s));
            System.out.println("isPalindrome1    : " + isPalindrome1(s));
            System.out.println("isReverseEqual   : " + isPalindrome2(s));
        }
    }
}
