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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;    
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;  // we arenot exactly caluclating height, remember doing for diameter calc
        }
        int left = height(node.left);
        int right = height(node.right);

        int d = left+right; // calculates the 
        diameter = Math.max(d, diameter);
        return Math.max(left, right)+1;
    } 

}