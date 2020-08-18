/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/majority-element/

https://leetcode.com/problems/majority-element/solution/

***********************************************/

class Solution {
    public int majorityElement(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        Map<Integer, Integer> counts = new HashMap();
        int majorityCount = nums.length / 2;
        
        for(int num : nums) {
            if(!counts.containsKey(num))
                counts.put(num, 1);
            else
                counts.put(num, counts.get(num) + 1);
            
            if(counts.get(num) > majorityCount)
                return num;
        }
        
        return 0;
    }
}

/////////// Boyer-Moore Voting Algorithm ////////////////////

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}

