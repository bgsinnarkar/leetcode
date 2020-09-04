/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/kth-largest-element-in-an-array/

https://www.youtube.com/watch?v=FrWq2rznPLQ

***********************************************/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        
        for(int n : nums) {
            minHeap.add(n);
            if(minHeap.size() > k)
                minHeap.remove();
        }
        
        return minHeap.remove();
    }
}