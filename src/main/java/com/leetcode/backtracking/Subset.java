package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subset {

    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        return recursiveSubset(nums, nums.length - 1);
    }

    private List<List<Integer>> recursiveSubset(int[] nums, int index) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        if (index < 0) {
            allSubsets.add(new ArrayList<>());
            return allSubsets;
        }

        allSubsets.add(new ArrayList<>(Collections.singleton(nums[index])));
        List<List<Integer>> recursiveSubs = recursiveSubset(nums, index - 1);
        allSubsets.addAll(recursiveSubs);
        for (List<Integer> listSub : recursiveSubs) {
            if (listSub.isEmpty()) {
                continue;
            }
            List<Integer> addCurrentToRecursiveSub = new ArrayList<>(listSub);
            addCurrentToRecursiveSub.add(nums[index]);
            allSubsets.add(addCurrentToRecursiveSub);
        }

        return allSubsets;
    }
}
