package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Subsets_Ti {
    /*
        Y tuong:
            - cac subsets truoc va cac subset + them phan tu hien tai vao
            - Ngay cai cho ma duyet qua tung phan tu trong cai mang nums
            - Cu moi khi duyet qua moi 1 phan tu thi no lay nhung cai subset truoc,
            - tao ra ban sao cua subset truoc + them phan tu hien tai vao cac ban sao do.
     */

    public List<List<Integer>> subsets (int[] nums){
        List<List<Integer>> result = new ArrayList<>(); // list list result
        result.add(new ArrayList<>()); // add empty list to list list result

        for (int num : nums){
            int size = result.size(); // to get the number of subsets currently in result
            for (int i = 0 ; i < size; ++i){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }

        return result;
    }

    // Method2: Backtracking --> watching solutions but some lines of code still not understand

    // Method3: Bit Manipulation --> haven't read
}
