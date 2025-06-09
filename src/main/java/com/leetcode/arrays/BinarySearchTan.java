package com.leetcode.arrays;
class Solution {
    public int binary_search(int l, int r, int[] nums, int target) {
        if (l > r) return -1;
        
        int mid = l + (r - l) / 2;
        
        if (nums[mid] == target) return mid;
        if (nums[mid] < target) {
            return binary_search(mid + 1, r, nums, target);
        } else {
            return binary_search(l, mid - 1, nums, target);
        }
    }

    public int search(int[] nums, int target) {
        return binary_search(0, nums.length - 1, nums, target);
    }

    public int search1(int[] nums, int target) {
       int l=0;
       int r=nums.length-1;
       while (l<=r)
       {
       int mid = l + (r - l) / 2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]<target)
        {
            l=mid+1;
        }
        else if(nums[mid]>target)
        {
            r=mid-1;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {-1,0,2,4,6,8};
        int target = 4;

        int[] nums1 = {-1,0,2,4,6,8};
        int target1 = 3;

        int[] nums2 = {};
        int target2 = 1;

        int[] nums3 = {-1,0,2,4,6,8};
        int target3 = 4;

        System.out.println("Test 1");
        System.out.println(sol.search(nums, target));
        System.out.println(sol.search1(nums, target));

        System.out.println("Test 2");
        System.out.println(sol.search(nums1, target1));
        System.out.println(sol.search1(nums1, target1));      
        
        System.out.println("Test 3");
        System.out.println(sol.search(nums2, target2));
        System.out.println(sol.search1(nums2, target2));

        System.out.println("Test 4");
        System.out.println(sol.search(nums3, target3));
        System.out.println(sol.search1(nums3, target3));
    }
}
