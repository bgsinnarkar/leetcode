/***********************************************

Time Complexity : O(n! * n) 
Space Complexity : O(n!)

https://leetcode.com/problems/permutations/

https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)

***********************************************/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> list = new ArrayList();
        backTrack(list, nums, new ArrayList<Integer>());
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, int[] nums, ArrayList<Integer> tempList) {
        
        if(tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));            
        }
        else {
            for(int i = 0; i < nums.length; i++) {
                if(tempList.contains(nums[i]))
                    continue;
                tempList.add(nums[i]);
                backTrack(list, nums, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }      
    }
}