package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        Map<Integer, Integer> mapNum2Count = new HashMap<>();
        for (int num : nums) {
            if (mapNum2Count.containsKey(num)) {
                return true;
            }
            mapNum2Count.put(num, mapNum2Count.getOrDefault(num, 0) + 1);
        }

        return false;
    }
}
