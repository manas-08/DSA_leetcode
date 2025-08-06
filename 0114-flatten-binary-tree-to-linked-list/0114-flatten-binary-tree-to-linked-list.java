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
    public void flatten(TreeNode root) {
        TreeNode node = root;
        helper(node);
    }
    public void helper(TreeNode node){
        if(node == null) return;

        TreeNode temp = node.right;
        node.right = node.left;
        node.left = null;
        TreeNode temp1 = node;
        while(temp1.right!= null){
            temp1=temp1.right;
        }
        temp1.right = temp;
        helper(node.right);
    }
}


// soln
// if (root == null) return;

//         flatten(root.right);
//         flatten(root.left);

//         root.right = prev;
//         root.left = null;
//         prev = root;