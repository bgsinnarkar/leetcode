/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/two-sum/

***********************************************/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int component = target - nums[i];
            if(map.containsKey(component) && map.get(component) != i) {
                return new int[] {map.get(component), i};                
            }
            else {
                map.put(nums[i], i);
            }
        }        
        throw new IllegalArgumentException("No two sum solution");        
    }
}