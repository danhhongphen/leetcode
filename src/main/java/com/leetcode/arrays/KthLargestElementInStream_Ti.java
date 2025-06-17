package com.leetcode.arrays;

import java.util.PriorityQueue;

public class KthLargestElementInStream_Ti {
    // ý tưởng chính là:
    /*
        - sử dụng minHeap size K largest value --> tại gì mình chỉ muốn cái k largest value thôi
        - nói chung là mình tận dụng cái minHeap để có cái số nhỏ nhất luôn nằm ở trên cùng
        - ví dụ mảng 3 5 8 2 vói k = 3
        - thì thí dụ 8 là 1st largest number
        - tiếp theo là 5 là 2nd largest number
        - tiếp theo là 3 là 3nd largest number
        - thì cái số 2 nó sẽ không bao giờ cần được xem xét tới là k-largest number (bằng đúng size K thôi)
        - mình sẽ lấy cái số 2 ra
        - rồi khi mà mình add(6) vào thì 4 nó sẽ lên trên cùng cái heap
        - thì 5 6 8 4 --> nó sẽ cập nhật là được cái 3rd largest number sẽ là 5
        - mình chỉ gom đúng cái minHeap có k-size thôi
    */
    int k;
    PriorityQueue<Integer> minHeap; // using minHeap because the smallest number always on peek
    public KthLargestElementInStream_Ti(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        // Nếu như Heap chưa chứa đủ k phần tử
        if (minHeap.size() < k) {
            minHeap.add(val);
            // Heap đã có k phần tử
        } else if (val > minHeap.peek()) {
            // Nếu như số mới lớn hơn số nhỏ nhất trong heap --> thì số mới này nằm trong top k
            // lấy cái số nhỏ nhất ra khỏi heap O(1)
            minHeap.poll(); // log(n)
            // thêm số mới vào
            minHeap.add(val);
        }
        // nếu cái value thêm mới vào nhỏ hơn cả cái minHeap.peek() --> bỏ qua không làm gì
        // phần tử on peek của heap () là phần tử nhỏ nhất trong top k
        return minHeap.peek();
    }
}
