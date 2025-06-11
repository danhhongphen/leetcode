package com.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidParenthesesTest {

    @Test
    void example1() {

        String a = "[{}]";
        ValidParentheses validParentheses  = new ValidParentheses();
        boolean isValid = validParentheses.isValid(a);
        assertThat(isValid).isEqualTo(true);
    }
}
