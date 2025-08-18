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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null && targetSum == 0) return false;
        return helper(root, targetSum);
    }
    public boolean helper(TreeNode root, int targetSum){ 
        if(root == null) return false;

        if(root.left == null && root.right == null && targetSum == root.val) return true;

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);
        return left || right;
    }
}

// if (root == null){ 
//             return false;
//         }
//         if (root.left == null && root.right == null && root.val == targetSum){
//             return true;
//         }
//         return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);