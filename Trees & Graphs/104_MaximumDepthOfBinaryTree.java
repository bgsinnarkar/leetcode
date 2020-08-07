/***********************************************

Time Complexity : O(n) Because we traverse the entire input tree once, the total run time is O(n)O(n), where nn is the total number of nodes in the tree.
Space Complexity : O(n) The number of recursive calls is bound by the height of the tree. In the worst case, the tree is linear and the height is in O(n). Therefore, space complexity due to recursive calls on the stack is O(n) in the worst case.

https://leetcode.com/problems/maximum-depth-of-binary-tree/

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
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

///////////////////////////////////////////////////////

public int maxDepth(TreeNode root) {
	
	TreeNode node = root;
	Stack<TreeNode> nodeStack = new Stack<TreeNode>();
	Stack<int> depthStack = new Stack<int>();
	
	int max = 0;
	int depth = 1;
	
	while (node != null || nodeStack.Count > 0)
	{
		if (node != null)
		{
			nodeStack.Push(node);
			depthStack.Push(depth);
			node = node.left;
			depth++;
		}
		else
		{
			node = nodeStack.Pop();
			depth = depthStack.Pop();
			
			if (depth > max) 
				max = depth;
			
			node = node.right;
			depth++;
		}
	}
	
	return max;
}