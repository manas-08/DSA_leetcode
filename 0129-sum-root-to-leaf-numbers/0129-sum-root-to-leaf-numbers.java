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
    ArrayList<Integer> l = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;

        int sum = root.val; // enter root node value by default
            // sum is being passed by value
        helper(root, sum);

        int res = 0;
        for(int i = 0; i < l.size(); i++){
            res += l.get(i);
        }
        System.out.println(l);
        return res;
    }
    public void helper(TreeNode node, int sum){

        if(node.left == null && node.right == null){
            l.add(sum);
            return; 
        }

        if(node.left != null) helper(node.left, sum*10 + node.left.val);
        if(node.right != null) helper(node.right, sum*10 + node.right.val);
    }
}