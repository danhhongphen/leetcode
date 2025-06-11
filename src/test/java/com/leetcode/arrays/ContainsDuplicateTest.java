package com.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainsDuplicateTest {

    @Test
    void containDuplicateIsTrue() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] nums = {1, 1, 2, 3};
        boolean hasDuplicate = containsDuplicate.hasDuplicate(nums);

        assertThat(hasDuplicate).isEqualTo(true);
    }

    @Test
    void containDuplicateIsFalse() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 4};
        boolean hasDuplicate = containsDuplicate.hasDuplicate(nums);

        assertThat(hasDuplicate).isEqualTo(false);
    }
}
