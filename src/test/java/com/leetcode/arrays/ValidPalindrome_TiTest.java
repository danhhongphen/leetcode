package com.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ValidPalindrome_TiTest {

    private final ValidPalindrome_Ti solution = new ValidPalindrome_Ti();

    // constructor
    ValidPalindrome_TiTest(){

    }
    // Case1: length = 1
    @Test
    void isPalindrome_SingleCharacter() {
        String s = "H";
        Assertions.assertTrue(this.solution.isPalindrome(s), "String \"H\" must return true");
        Assertions.assertTrue(this.solution.isPalindrome_2(s), "String \"H\" must return true");
        Assertions.assertTrue(this.solution.isPalindrome_3(s), "String \"H\" must return true");
    }
    // Case2: Valid Palindrome
    @Test
    void isPalindrome_Valid() {
        String s = "Was it a car or a cat I saw?";
        Assertions.assertTrue(this.solution.isPalindrome(s), "String \"Was it a car or a cat I saw?\" must return true");
        Assertions.assertTrue(this.solution.isPalindrome_2(s), "String \"Was it a car or a cat I saw?\" must return true");
        Assertions.assertTrue(this.solution.isPalindrome_3(s), "String \"Was it a car or a cat I saw?\" must return true");
    }
    // Case3: Invalid Palindrome
    @Test
    void isPalindrome_Invalid() {
        String s = "tab a cat";
        Assertions.assertFalse(this.solution.isPalindrome(s), "String \"tab a cat\" must return false");
        Assertions.assertFalse(this.solution.isPalindrome_2(s), "String \"tab a cat\" must return false");
        Assertions.assertFalse(this.solution.isPalindrome_3(s), "String \"tab a cat\" must return false");
    }
    // Case4: Valid Palindrome with non-alphanumeric characters
    @Test
    void isPalindrome_ValidWithNonAlphanumericCharacters() {
        String s = "Was it a car or a cat I saw?";
        Assertions.assertTrue(this.solution.isPalindrome(s), "String \"Was it$$$ a car !!!! or a cat *** I saw?\" must return true");
        Assertions.assertTrue(this.solution.isPalindrome_2(s), "String \"Was it$$$ a car !!!! or a cat *** I saw?\" must return true");
        Assertions.assertTrue(this.solution.isPalindrome_3(s), "String \"Was it$$$ a car !!!! or a cat *** I saw?\" must return true");

    }
    // Case5: Invalid Palindrome with non-alphanumeric characters
    @Test
    void isPalindrome_InvalidWithNonAlphanumericCharacters() {
        String s = "tab@@@ a# cat&*)*^[]+-*/~`(&()*&";
        Assertions.assertFalse(this.solution.isPalindrome(s), "String \"tab a cat\" must return false");
        Assertions.assertFalse(this.solution.isPalindrome_2(s), "String \"tab a cat\" must return false");
        Assertions.assertFalse(this.solution.isPalindrome_3(s), "String \"tab a cat\" must return false");

    }
}