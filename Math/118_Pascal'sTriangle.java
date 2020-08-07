/***********************************************

Time Complexity : O(n ^ 2) 
Space Complexity : O(n ^ 2) Because we need to store each number that we update in triangle, the space requirement is the same as the time complexity.

https://leetcode.com/problems/pascals-triangle/

https://leetcode.com/problems/pascals-triangle/solution/

***********************************************/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        // First base case
        if(numRows == 0)
            return triangle;
        
        // Second base case
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        
        for(int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevRow = triangle.get(i - 1);
            
            // First element is always 1
            row.add(1);
            
            for(int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Last element is also always 1
            row.add(1);
            triangle.add(row);
        }
        
        return triangle;
    }
}