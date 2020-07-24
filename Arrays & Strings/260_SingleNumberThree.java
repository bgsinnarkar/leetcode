/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/bulls-and-cows/

***********************************************/

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            if(map.get(num) != null)
                map.remove(num);
            else
                map.put(num, 1);
        }
        
        if(!map.isEmpty()) {            
            int[] array = new int[2];  
            int index = 0;
            for(Integer element : map.keySet()) 
                array[index++] = element.intValue();
            return array;
        }
        
        return new int[2];
    }
}

////////////////////////////////////////////////////////

public class Solution {
    public int[] singleNumber(int[] nums) {
        // Pass 1 : 
        // Get the XOR of the two numbers we need to find
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit
        diff &= -diff;
        
        // Pass 2 :
        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0) // the bit is not set
            {
                rets[0] ^= num;
            }
            else // the bit is set
            {
                rets[1] ^= num;
            }
        }
        return rets;
    }
}