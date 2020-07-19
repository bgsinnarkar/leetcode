/***********************************************

Time Complexity : O(Courses + Edges)
Space Complexity : O(V + E)

https://leetcode.com/problems/course-schedule-ii/

***********************************************/

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] inDegree = new int[numCourses];
        Map<Integer, List<Integer>> graph = new HashMap<>();
                
        for(int[] edges : prerequisites) {
            int start = edges[1];
            int end = edges[0];

            //start -> end
            inDegree[end]++;
            graph.putIfAbsent(start, new ArrayList<>());
            graph.get(start).add(end);
        }               
        
        Queue<Integer> q = new LinkedList();
        for(int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0) 
                q.offer(i);            
        }
        
        int[] order = new int[numCourses];
        int k = 0;
        
        while(!q.isEmpty()) {
            int course = q.poll();
            order[k++] = course;
            
            if(graph.containsKey(course)) {
                for(int node : graph.get(course)) {
                    if(--inDegree[node] == 0) {
                        q.offer(node);
                    }
                }
            }
        }
        
        return k == numCourses ? order : new int[0];
    }
}