/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/gas-station/

https://leetcode.com/problems/gas-station/discuss/42568/Share-some-of-my-ideas.

https://www.youtube.com/watch?v=0D5xNs2Fy4Q

***********************************************/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int sumGas = 0;
        int sumCost = 0;
        int start = 0;
        int tank = 0;
        
        for(int i = 0; i < gas.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
            tank += gas[i] - cost[i];
            
            if(tank < 0) {
                tank = 0;
                start = i + 1;
            }
        }
        
        if(sumGas < sumCost)
            return -1;
        else 
            return start;
        
    }
}
