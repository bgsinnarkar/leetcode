/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/contains-duplicate/

https://leetcode.com/problems/contains-duplicate/submissions/

***********************************************/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        
        for(int num : nums) {
            if(set.contains(num))
                return true;
            set.add(num);
        }
        
        return false;
    }
}