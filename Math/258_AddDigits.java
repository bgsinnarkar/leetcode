/***********************************************

Time Complexity : O(1)
Space Complexity : O(1)

https://leetcode.com/problems/add-digits/

https://leetcode.com/problems/add-digits/solution/

***********************************************/

class Solution {
    public int addDigits(int num) {
        
        if(num == 0) 
            return 0;
        if(num % 9 == 0)
            return 9;
        
        return num % 9;
    }
}

//////////////////////////////////////

class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}