package com.leetcode.binary.search;

public class BinarySearch {

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        return binarySearch(nums, target, left, right);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] > target) {
            return binarySearch(nums, target, left, mid - 1);
        }
        else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, right);
        }
        return -1;
    }
}
