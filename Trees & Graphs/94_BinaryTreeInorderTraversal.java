/***********************************************

Time Complexity : O(n)
Space Complexity : O(n) best case, O(log n) avg case

https://leetcode.com/problems/binary-tree-inorder-traversal/

https://leetcode.com/problems/binary-tree-inorder-traversal/solution/

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
 
 // Recursive
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList();
        helper(root, res);
        return res;
    }
    
    private void helper(TreeNode root, List<Integer> res) {
        if(root != null) {
            if(root.left != null) {
                helper(root.left, res);
            }
            
            res.add(root.val);
            
            if(root.right != null) {
                helper(root.right, res);
            }
        }
    }
}

// Iterative
// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList();
        Stack<TreeNode> st = new Stack();
        TreeNode curr = root;
        
        while(curr != null || !st.isEmpty()) {
            while(curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        
        return res;
    }
}

