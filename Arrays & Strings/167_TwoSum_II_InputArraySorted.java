/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

***********************************************/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            
            if(map.containsKey(complement) && map.get(complement) < i) {
                return new int[] {map.get(complement) + 1, i + 1};
            }
            else {
                map.put(numbers[i],i);
            }
        }        
        throw new IllegalArgumentException("No data found");
    }
}

