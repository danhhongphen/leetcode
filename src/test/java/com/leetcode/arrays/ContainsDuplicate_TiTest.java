package com.leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicate_TiTest {
    private final ContainsDuplicate_Ti solution = new ContainsDuplicate_Ti();

    ContainsDuplicate_TiTest() {

    }

    @Test
    void hasDuplicate_arrayLengthLTE1_shouldReturnFalse() {
        int[] nums = new int[]{1};
        Assertions.assertFalse(this.solution.hasDuplicateWithHashSet(nums), "Mảng {1} phải trả về false");
    }

    @Test
    void containsDuplicate_allElementsAreSame_shouldReturnTrue() {
        int[] nums = new int[]{1, 1, 1, 1};
        Assertions.assertTrue(this.solution.hasDuplicateWithHashSet(nums), "Mảng {1, 1, 1, 1} phải trả về true");
    }

    @Test
    void containsDuplicate_whenDuplicatesExist_shouldReturnTrue() {
        int[] nums = new int[]{1, 2, 3, 1};
        Assertions.assertTrue(this.solution.hasDuplicateWithHashSet(nums), "Mảng {1, 2, 3, 1} phải trả về true");
    }

    @Test
    void containsDuplicate_whenDuplicatesNotExist_shouldReturnFalse() {
        int[] nums = new int[]{1, 2, 3, 4};
        Assertions.assertFalse(this.solution.hasDuplicateWithHashSet(nums), "Mảng {1, 2, 3, 4} phải trả về false");
    }
}