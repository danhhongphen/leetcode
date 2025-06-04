package com.leetcode.arrays;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.HashSet;
public class Duplicate_Tan {

    // 2 loops

    public boolean hasDuplicate1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Sort and check

    public boolean hasDuplicate2(int[] nums) {
        if (nums.length < 2) return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /*
     * Cho phép lưu theo cơ sở dữ liệu cây và không lưu trùng phần tử
     */

    public boolean hasDuplicate3(int[] nums) {
        TreeSet<Integer> seen = new TreeSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    /*
     * Sử dụng bảng băm lưu giá trị và cũng không lưu các phần tử trùng lặp
     */

    public boolean hasDuplicate4(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Duplicate_Tan sol = new Duplicate_Tan();

        int[] arr1 = {1, 2, 3, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {};

        System.out.println("Check array 1"); 
        System.out.println("2 Loops:" + sol.hasDuplicate1(arr1)); 
        System.out.println("Sort + Check:" + sol.hasDuplicate2(arr1)); 
        System.out.println("Tree Set:" + sol.hasDuplicate3(arr1));
        System.out.println("Hash Set:" + sol.hasDuplicate4(arr1)); 

        System.out.println("\nCheck array 2"); 
        System.out.println("2 Loops:" + sol.hasDuplicate1(arr2)); 
        System.out.println("Sort + Check:" + sol.hasDuplicate2(arr2)); 
        System.out.println("Tree Set:" + sol.hasDuplicate3(arr2));
        System.out.println("Hash Set:" + sol.hasDuplicate4(arr2)); 
        
        System.out.println("\nCheck array 3"); 
        System.out.println("2 Loops:" + sol.hasDuplicate1(arr3)); 
        System.out.println("Sort + Check:" + sol.hasDuplicate2(arr3)); 
        System.out.println("Tree Set:" + sol.hasDuplicate3(arr3));
        System.out.println("Hash Set:" + sol.hasDuplicate4(arr3)); 
    }
}
