/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/all-paths-from-source-to-target/

***********************************************/

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> res = new ArrayList();
        List<Integer> path = new ArrayList();
        
        path.add(0);
        dfs(graph, res, path, 0);
        
        return res;
    }
    
    private void dfs(int[][] graph, List<List<Integer>> res, List<Integer> path, int cur) {
        if(cur == graph.length - 1) {
            res.add(new ArrayList(path));
            return;
        }
        
        for(int next : graph[cur]) {
            path.add(next);
            dfs(graph, res, path, next);
            path.remove(path.size() - 1);
        }
    }
}