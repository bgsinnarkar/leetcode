/***********************************************

Time Complexity : O(N log k) if k < N and O(N) in the particular case of N = k
Space Complexity : O(N + k) N for hashmap and k for heap

https://leetcode.com/problems/top-k-frequent-elements/

***********************************************/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // O(1) time
        if(k == nums.length) {
            return nums;
        }
        
        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> 
                                    count.get(n1) - count.get(n2));
        
        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for(int n : count.keySet()) {
            heap.add(n);
            if(heap.size() > k) 
                heap.poll();
        }
        
        // 3. build an output array
        // O(k log k) time
        int[] result = new int[k];
        for(int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }
            
        return result;
    }
}