/***********************************************

Time Complexity : O(log n)
Space Complexity : O(1)

https://leetcode.com/problems/factorial-trailing-zeroes/

https://leetcode.com/problems/factorial-trailing-zeroes/discuss/52371/My-one-line-solutions-in-3-languages

***********************************************/

class Solution {
    public int trailingZeroes(int n) {
        
        if(n == 0)
            return 0;
        else 
            return (n / 5) + trailingZeroes(n / 5);
    }
}