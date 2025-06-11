package com.leetcode.binary.search;

import com.leetcode.arrays.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {

    @Test
    void containDuplicateIsTrue() {
        BinarySearch binarySearch = new BinarySearch();

        int[] nums = {-1,0,2,3,4,6,8,9};
        int output = binarySearch.search(nums, 4);

        assertThat(output).isEqualTo(4);
    }

    @Test
    void containDuplicateIsTrue1() {
        BinarySearch binarySearch = new BinarySearch();

        int[] nums = {-1,0,3,5,9,12};
        int output = binarySearch.search(nums, 9);

        assertThat(output).isEqualTo(4);
    }
}
