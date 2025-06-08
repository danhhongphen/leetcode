package com.leetcode.arrays;

public class TwoSum_Ti
{
    public int[] twoSum(int[] nums, int target)
    {
        // check null Array
        if (nums == null)
        {
            return null;
        }
        // check if nums doesn't have any element
        else if (nums.length == 0)
        {
            System.out.println("nums length is: " + nums.length);
            return null;
        }

        /*
            Y tuong cua em la:
            - em se gioi han hai dau lai la currStart va currEnd
            - va cac idx i, j se chay trong khoang do
            - voi i = currStart + 1 --> i se chay den currEnd
            - va j = currEnd - 1 --> j se chay nguoc tu currEnd - 1 den currStart
            - Duyet cho toi khi nao ma currStart + currEnd == target
        */
        int currStart = 0;
        int currEnd = nums.length - 1;
        int tmpTarget = nums[currStart] + nums[currEnd];
        if (tmpTarget == target)
        {
            return new int[]{currStart, currEnd};
        }
        int i = currStart + 1;
        int j = currEnd - 1;
        while(currStart < currEnd || tmpTarget != target)
        {

            if (nums[currStart] + nums[i] == target)
            {
                return new int[]{currStart, i};
            }
            else if (nums[currEnd] + nums[j] == target)
            {
                return new int[]{j, currEnd};
            }
            ++i;
            --j;
            if (i == currEnd)
            {
                if (nums[currStart] + nums[i] == target)
                {
                    return new int[]{currStart, i};
                }
                --currEnd;
                j = currEnd - 1;
                ++currStart;
                i = currStart + 1;
            }
        }
        return new int[]{currStart, currEnd};
    }


    public static void main(String[] args)
    {
        TwoSum_Ti sol = new TwoSum_Ti();

        int [] nums1 = {3,4,5,6};
        int target1 = 7;
        int[] sol1 = sol.twoSum(nums1, target1);
        System.out.println("Output: [" + sol1[0] + "," + sol1[1] + "]");
        int [] nums2 = {5,5};
        int target2 = 10;
        int[] sol2 = sol.twoSum(nums2, target2);
        System.out.println("Output: [" + sol2[0] + "," + sol2[1] + "]");
        int [] nums3 = {4,5,6};
        int target3 = 10;
        int[] sol3 = sol.twoSum(nums3, target3);
        System.out.println("Output: [" + sol3[0] + "," + sol3[1] + "]");

    }
}
