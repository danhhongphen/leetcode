package com.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SubsetTest {

    @Test
    void subsetsTest1() {
        int[] nums = {1, 2, 3};

        Subset subset = new Subset();

        List<List<Integer>> subsets = subset.subsets(nums);
        System.out.println(subsets.toString());
        assertThat(subsets).isSubsetOf(List.of(), List.of(1), List.of(2), List.of(1, 2),
                List.of(3), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3));
//        assertThat(subsets).isSubsetOf(List.of(1));
//        assertThat(subsets).isSubsetOf(List.of(2));
//        assertThat(subsets).isSubsetOf(List.of(1, 2));
//        assertThat(subsets).isSubsetOf(List.of(3));
//        assertThat(subsets).isSubsetOf(List.of(1, 3));
//        assertThat(subsets).isSubsetOf(List.of(2, 3));
//        assertThat(subsets).isSubsetOf(List.of(1, 2, 3));
    }
}
