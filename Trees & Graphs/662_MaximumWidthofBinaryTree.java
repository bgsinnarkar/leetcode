/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/maximum-width-of-binary-tree/

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
    int maxWidth;
    HashMap<Integer, Integer> leftmostPos;
    
    public int widthOfBinaryTree(TreeNode root) {
        maxWidth = 0;
        leftmostPos = new HashMap<>();
        getWidth(root, 0, 0);
        return maxWidth;
    }
    
    public void getWidth(TreeNode root, int depth, int position) {
        if(root == null)
            return;
        leftmostPos.computeIfAbsent(depth, x->position);
        maxWidth = Math.max(maxWidth, position - leftmostPos.get(depth) + 1);
        getWidth(root.left, depth + 1, position * 2);
        getWidth(root.right, depth + 1, position * 2 + 1);
    }
}