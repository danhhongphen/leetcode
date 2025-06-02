package com.leetcode.arrays;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void example1() {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        
        // Check that the result contains indices 0 and 1 (in any order)
        assertThat(result).hasSize(2);
        assertThat(nums[result[0]] + nums[result[1]]).isEqualTo(target);
        assertThat(result).containsExactlyInAnyOrder(0, 1);
    }
    
    @Test
    void example2() {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        
        int[] result = solution.twoSum(nums, target);
        
        assertThat(result).hasSize(2);
        assertThat(nums[result[0]] + nums[result[1]]).isEqualTo(target);
        assertThat(result).containsExactlyInAnyOrder(1, 2);
    }
    
    @Test
    void example3() {
        TwoSum solution = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        
        int[] result = solution.twoSum(nums, target);
        
        assertThat(result).hasSize(2);
        assertThat(nums[result[0]] + nums[result[1]]).isEqualTo(target);
        assertThat(result).containsExactlyInAnyOrder(0, 1);
    }
}
