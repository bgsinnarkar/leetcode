/***********************************************

Time complexity : O(n)
Space complexity : O(min(m,n)). We need O(k) space for the sliding window, where k is the size of the Set. The size of the Set is upper bounded by the size of the string n and the size of the charset/alphabet m.

https://leetcode.com/problems/longest-substring-without-repeating-characters/

https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/

***********************************************/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0)
            return 0;
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        
        for(int i=0, j=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1);
            }            
            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }        
        
        return max;
    }
}

/////////////////////////////////////////////

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}

