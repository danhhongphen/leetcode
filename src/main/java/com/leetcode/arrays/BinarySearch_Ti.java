package com.leetcode.arrays;

public class BinarySearch_Ti {

    // Y tuong
    /*
        ban dau minh se co left, right --> gioi han hai dau
        mid la idx giua left va right
        neu nhu nums[mid] == target --> return mid
        con neu nhu ma nums[mid] > target nghia la cai muc tieu minh dang tim co the dang nam tu left -> mid - 1
        nguoc lai nums[mid] < target nghia a cai target minh dang tim nam tu mid + 1 --> right
        tat ca dieu nay co duoc la nho cai mang ban dau phai duoc sort
    * */
    public int search(int[] nums, int target)
    {
        // validate input
        if (nums == null || nums.length == 0)
        {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else if (nums[mid] > target)
            {
                right = mid - 1;
            }
        }
        return -1;
    }


    public int searchRecursive (int [] nums, int target, int left, int right)
    {
        // dieu kien dung --> avoid endless loop
        if (left > right)
        {
            return -1;
        }
        int mid = left + ((right -left) / 2);
        if (nums[mid] == target)
        {
            return mid;
        }
        else if (nums[mid] > target)
        {
            return searchRecursive(nums, target, left, mid - 1);
        }
        else
        {
            return searchRecursive(nums, target, mid + 1, right);
        }
    }

}
