package com.leetcode.binarysearch;

public class BinarySearch {
    public static int binarySearch(int [] arr, int target){
        int res = -1;

        int index = arr.length /2;
        while (index < arr.length ) {
            if (target > arr[index]) {
                index = index * 2;
            }
            if (target < arr[index]) {
                index = index / 2;
            }
            if(target == arr[index]){
                return  index;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,8,9,12,23,34,56,78,99};
        System.out.println(binarySearch(arr,6));
    }
}
