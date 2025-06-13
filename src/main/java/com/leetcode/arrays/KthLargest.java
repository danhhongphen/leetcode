package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargest {
    /*
     * Ý tưởng
     * B1: Kiểm tra độ dài mảng
     * Nếu rỗng trả về null
     * Nếu <k trả về min mảng
     * Nếu >k sắp xếp lại từ cao -> thấp và trả ra giá trị thứ k-1
     */
    /* 
    private int temp; // why not k ?
    private int[] stream;
    private int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    private void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public KthLargest(int k, int[] nums) {
        this.temp = k;
        stream = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            stream[i] = nums[i];
        }
    }
    public int add(int val) {
        int[] newStream = new int[stream.length + 1];
        for (int i = 0; i < stream.length; i++) {
            newStream[i] = stream[i];
        }
        newStream[stream.length] = val;
        stream = newStream;

        if (stream.length == 0) {
            return -1;
        }

        if (stream.length < temp) {
            return findMin(stream);
        }
        sortDescending(stream);
        return stream[temp - 1];
    }
*/
    private int k;
    private List<Integer> stream;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.stream = new ArrayList<>();
        for (int num : nums) {
            stream.add(num);
        }
    }

    public Integer add(int val) {
        stream.add(val);
        if (stream.size() == 0) {
            return null;
        }
        if (stream.size() < k) {
            return Collections.min(stream);
        }
        stream.sort(Collections.reverseOrder());
        return stream.get(k - 1);
    }

    public static void main(String[] args) {
        KthLargest kth = new KthLargest(3, new int[]{1, 2, 3, 3});
        System.out.println(kth.add(3));
        System.out.println(kth.add(5));
        System.out.println(kth.add(6));
        System.out.println(kth.add(7));
        System.out.println(kth.add(8));
    }
}
