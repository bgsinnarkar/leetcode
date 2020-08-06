/***********************************************

Time Complexity : O(N * K) where N is the length of strs, and K is the maximum length of a string in strs
Space Complexity : O(N * K)

https://leetcode.com/problems/group-anagrams/

https://leetcode.com/problems/group-anagrams/solution/

***********************************************/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0)
            return new ArrayList<>();
        Map<String, List> res = new HashMap<String, List>();
        int[] count = new int[26];
        
        for(String s : strs) {
            Arrays.fill(count, 0);
            for(char c : s.toCharArray())
                count[c - 'a']++;
            
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!res.containsKey(key))
                res.put(key, new ArrayList());
            res.get(key).add(s);
        }
        
        return new ArrayList(res.values());
    }
}