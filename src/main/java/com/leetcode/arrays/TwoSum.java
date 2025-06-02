package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problem 1: Two Sum
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the 
 * same element twice.
 * 
 * You can return the answer in any order.
 */
public class TwoSum {
    
    /**
     * Finds two numbers in the array that add up to the target.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * @param nums Array of integers
     * @param target Target sum
     * @return Array of two indices whose values sum to target
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            
            numToIndex.put(nums[i], i);
        }
        
        // No solution found (per problem constraints, this shouldn't happen)
        return new int[] { -1, -1 };
    }
}
