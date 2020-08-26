/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/validate-binary-search-tree/

https://leetcode.com/problems/validate-binary-search-tree/solution/

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
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }    
    
    public boolean validate(TreeNode root, Integer max, Integer min) {
        
        if(root == null) {
            return true;
        }
        
        if(min != null && min >= root.val) 
            return false;
        else if(max != null && max <= root.val)
            return false;
        else {
            return validate(root.left, root.val, min) && validate(root.right, max, root.val);
        }
    }
}

// Iterative

class Solution {
	LinkedList<TreeNode> stack = new LinkedList();
	LinkedList<Integer> uppers = new LinkedList();
	LinkedList<Integer> lowers = new LinkedList();

	public void update(TreeNode root, Integer lower, Integer upper) {
	stack.add(root);
	lowers.add(lower);
	uppers.add(upper);
	}

	public boolean isValidBST(TreeNode root) {
		Integer lower = null, upper = null, val;
		update(root, lower, upper);

		while (!stack.isEmpty()) {
		  root = stack.poll();
		  lower = lowers.poll();
		  upper = uppers.poll();

		  if (root == null) 
			  continue;
		  val = root.val;
		  if (lower != null && val <= lower) 
			  return false;
		  if (upper != null && val >= upper) 
			  return false;
		  update(root.right, val, upper);
		  update(root.left, lower, val);
		}

		return true;
	}
}

