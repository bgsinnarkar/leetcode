/***********************************************

Time Complexity : O(H + k) where H is a tree height. This complexity is defined by the stack, which contains at least H + k elements, since before starting to pop out one has to go down to a leaf. This results in O(log N + k) for the balanced tree and O(N + k) for completely unbalanced tree with all the nodes in the left subtree.
Space Complexity : O(H) to keep the stack, where H is a tree height. That makes O(N) in the worst case of the skewed tree, and O(log N) in the average case of the balanced tree.

https://leetcode.com/problems/kth-smallest-element-in-a-bst/

https://leetcode.com/problems/kth-smallest-element-in-a-bst/solution/

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
    public int kthSmallest(TreeNode root, int k) {
        
        LinkedList<TreeNode> stack = new LinkedList();
        
        while(true) {
            while(root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if(--k == 0)
                return root.val;
            root = root.right;
        }
    }
}

//////////////////////////////////////////////////////////

class Solution {
  public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
    if (root == null) return arr;
    inorder(root.left, arr);
    arr.add(root.val);
    inorder(root.right, arr);
    
	return arr;
  }

  public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
    
	return nums.get(k - 1);
  }
}