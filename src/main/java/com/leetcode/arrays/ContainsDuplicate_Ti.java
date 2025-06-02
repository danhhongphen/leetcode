package com.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate_Ti {

    public boolean hasDuplicateWithHashMap(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num))
                return true;
            seen.put(num, 1);
        }
        return false;
    }

    public boolean hasDuplicateWithStream(int[] nums) {
        // Arrays.stream(tên mảng, collection, list) --> nghĩa là chuyển mảng thành 1 luồng (stream)
        // .stream(nums) --> để xử lý dữ liệu theo kiểu hàm (functional)
        // .distinct() --> tất cả các giá trị là duy nhất
        // tên mảng.length --> lấy độ dài mảng
        // khi mà đã biến thành 1 luồng để xử lý theo dạng hàm thì
        // ==> .count() để đếm số lượng phần tử
        // ==> .count() là phương thức để dành riêng cho stream để đếm phần tử
        return Arrays.stream(nums).distinct().count() < nums.length ? true : false;
    }

    public boolean hasDuplicateWithHashSet(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums){
            if (seen.contains(num))
                return true;
            seen.add(num);
        }

        return false;
    }

    // add main method for quick testing (Optional)
    public static void main(String [] args){
        ContainsDuplicate_Ti sol = new ContainsDuplicate_Ti();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println("nums1 (HashMap): " + sol.hasDuplicateWithHashMap(nums1)); // true
        System.out.println("nums1 (Stream) : " + sol.hasDuplicateWithStream(nums1));  // true
        System.out.println("nums1 (HashSet): " + sol.hasDuplicateWithHashSet(nums1)); // true
        System.out.println("---");

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("nums2 (HashMap): " + sol.hasDuplicateWithHashMap(nums2)); // false
        System.out.println("nums2 (Stream) : " + sol.hasDuplicateWithStream(nums2));  // false
        System.out.println("nums2 (HashSet): " + sol.hasDuplicateWithHashSet(nums2)); // false
        System.out.println("---");

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("nums3 (HashMap): " + sol.hasDuplicateWithHashMap(nums3)); // true
        System.out.println("nums3 (Stream) : " + sol.hasDuplicateWithStream(nums3));  // true
        System.out.println("nums3 (HashSet): " + sol.hasDuplicateWithHashSet(nums3)); // true
        System.out.println("---");

        int[] nums4 = {}; // Mảng rỗng
        System.out.println("nums4 (HashMap): " + sol.hasDuplicateWithHashMap(nums4)); // false
        System.out.println("nums4 (Stream) : " + sol.hasDuplicateWithStream(nums4));  // false
        System.out.println("nums4 (HashSet): " + sol.hasDuplicateWithHashSet(nums4)); // false
        System.out.println("---");
    }
}
