/***********************************************

Time Complexity : O(n) 
Space Complexity : O(1) 

https://leetcode.com/problems/single-number/

https://leetcode.com/problems/single-number/solution/

***********************************************/

class Solution {
    public int singleNumber(int[] nums) {
        
        int a = 0;
        
        for(int i : nums) {
            a = a ^ i;
        }
        
        return a;
    }
}

/////////////////////////////////////


class Solution {
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hash_table = new HashMap<>();

		for (int i : nums) {
		  hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
		}
		
		for (int i : nums) {
		  if (hash_table.get(i) == 1) {
			return i;
		  }
		}
		
		return 0;
	}
}