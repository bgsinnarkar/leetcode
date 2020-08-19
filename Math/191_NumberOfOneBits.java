/***********************************************

Time Complexity : O(n) The run time depends on the number of 1-bits in n. In the worst case, all bits in n are 1-bits. In case of a 32-bit integer, the run time is O(1).
Space Complexity : O(1)

https://leetcode.com/problems/number-of-1-bits/

https://leetcode.com/problems/number-of-1-bits/solution/

***********************************************/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int sum = 0;
        
        while(n != 0) {
            sum++;
            n = n & (n - 1);
        }
        
        return sum;
    }
}