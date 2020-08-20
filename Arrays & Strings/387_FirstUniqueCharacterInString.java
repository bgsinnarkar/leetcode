/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/first-unique-character-in-a-string/

***********************************************/

class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> map = new HashMap();
        int n = s.length();
        
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < n; i++) {
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        
        return -1;
    }
}