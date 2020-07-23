/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

***********************************************/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
               
        List<List<Integer>> res = new ArrayList<>();        
        if(root == null) 
            return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        boolean order = true;
        int size = 1;
        q.add(root);
        
        while(!q.isEmpty()) {
            LinkedList<Integer> temp = new LinkedList();
            for(int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                if(order) {
                    temp.add(n.val);
                }
                else {
                    temp.add(0, n.val);
                }
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);
            }
            res.add(temp);
            size = q.size();
            order = !order;
        }
        
        return res;
    }
}

