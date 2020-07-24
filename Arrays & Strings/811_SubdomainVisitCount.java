/***********************************************

Time Complexity : O(n) number of cpdomains
Space Complexity : O(n)

https://leetcode.com/problems/subdomain-visit-count/

***********************************************/

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap();
        
        for(String cd : cpdomains) {
            int i = cd.indexOf(' ');
            int n = Integer.valueOf(cd.substring(0,i));
            String s = cd.substring(i + 1);
            
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '.') {
                    String d = s.substring(j + 1);
                    map.put(d, map.getOrDefault(d, 0) + n);
                }
            }
            map.put(s, map.getOrDefault(s, 0) + n);
        }
        
        List<String> res = new ArrayList();
        for(String s : map.keySet()) {
            res.add("" + map.get(s) + " " + s);
        }
        
        return res;
    }
}