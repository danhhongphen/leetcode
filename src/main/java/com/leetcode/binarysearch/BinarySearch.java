package com.leetcode.binarysearch;

public class BinarySearch {
    public static int search(int [] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        binarySearch(arr, target, left, right);
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left >= right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right);
        }
        else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,8};
        System.out.println(search(arr,6));
    }


}
