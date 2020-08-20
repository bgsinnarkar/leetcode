/***********************************************

Time Complexity : O(max(m, n))
Space Complexity : O(1)

https://leetcode.com/problems/intersection-of-two-arrays-ii/

https://leetcode.com/problems/intersection-of-two-arrays-ii/discuss/282372/Java-solution-with-all-3-follow-up-questions

***********************************************/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums1) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : nums2) {
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        
        int[] ret = new int[list.size()]; 
        
        for(int i = 0; i < list.size(); i++){
            ret[i] = list.get(i);
        }
        
        return ret;        
    }
}




