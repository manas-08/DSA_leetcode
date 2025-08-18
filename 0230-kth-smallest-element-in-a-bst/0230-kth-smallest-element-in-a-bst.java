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
    // bruteForce approach
    // List<Integer> l = new ArrayList<>();
    // public Integer kthSmallest(TreeNode root, int k) {
    //     inorder(root);
    //     System.out.println(l);
    //     return l.get(k-1); 
    // }
    // public void inorder(TreeNode node){
    //     if(node == null) return;
    //     inorder(node.left);
    //     if(node != null) l.add(node.val);
    //     inorder(node.right);
    // }
    int count = 0;
    public int kthSmallest(TreeNode root, int k){
        TreeNode node = helper(root, k);
        return node.val;
    }
    public TreeNode helper(TreeNode node, int k){
        if(node == null) return null;

        TreeNode left = helper(node.left, k);
        if(left != null) return left;
        count++;
        if(count == k) return node;
        return helper(node.right, k);
    }
}