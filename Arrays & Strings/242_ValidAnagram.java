/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/valid-anagram/

https://leetcode.com/problems/valid-anagram/solution/

***********************************************/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) 
            return false;
        
        Map<Character, Integer> map = new HashMap();
        
        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        
        for(char c :t.toCharArray()) {
            if(!map.containsKey(c))
                return false;
            else {
                map.put(c, map.get(c) - 1);
                if(map.get(c) < 0)
                    return false;
            }
        }
        
        return true;
    }
}

//////////////////////////////////////////////

public boolean isAnagram(String s, String t) {
    
	if (s.length() != t.length()) {
        return false;
    }
    
	int[] table = new int[26];
    
	for (int i = 0; i < s.length(); i++) {
        table[s.charAt(i) - 'a']++;
    }
    
	for (int i = 0; i < t.length(); i++) {
        table[t.charAt(i) - 'a']--;
        if (table[t.charAt(i) - 'a'] < 0) {
            return false;
        }
    }
    
	return true;
}