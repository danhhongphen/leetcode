package com.leetcode.twoPointer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsPalindromeTest {

    @Test
    public void isString_Palindrome_True() {
        String s = "Was it a car or a cat I saw?";
        IsPalindrome twoPointer = new IsPalindrome();
        boolean isPalindrome = twoPointer.isPalindrome(s);
        assertThat(isPalindrome).isEqualTo(true);

    }

    @Test
    public void isString_Palindrome_False() {
        String s = "tab a cat";
        IsPalindrome twoPointer = new IsPalindrome();
        boolean isPalindrome = twoPointer.isPalindrome(s);
        assertThat(isPalindrome).isEqualTo(false);
    }

    @Test
    public void isString_Palindrome_NoLemon_True() {
        String s = "No lemon, no melon";
        IsPalindrome twoPointer = new IsPalindrome();
        boolean isPalindrome = twoPointer.isPalindrome(s);
        assertThat(isPalindrome).isEqualTo(true);
    }
}
