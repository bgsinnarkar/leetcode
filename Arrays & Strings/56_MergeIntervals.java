/***********************************************

Time Complexity : O(n log n)
Space Complexity : O(1)

https://leetcode.com/problems/merge-intervals/

https://www.youtube.com/watch?v=qKczfGUrFY4

***********************************************/

class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1)
            return intervals;
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        List<int[]> output = new ArrayList();
        int[] currentArray = intervals[0];
        output.add(currentArray);
        
        for(int[] interval : intervals) {
            int currentStart = currentArray[0];
            int currentEnd = currentArray[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            if(currentEnd >= nextStart)
                currentArray[1] = Math.max(currentEnd, nextEnd);
            else {
                currentArray = interval;
                output.add(currentArray);
            }                
        }
        
        return output.toArray(new int[output.size()][]);
    }
}

