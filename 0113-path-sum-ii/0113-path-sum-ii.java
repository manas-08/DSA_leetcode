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
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, 0, new ArrayList<>());
        return l;
    }
    public void dfs(TreeNode root, int targetSum, int sum, List<Integer> list){
        if(root == null) return;
        sum+= root.val;
        List<Integer> temp = new ArrayList<>(list);
        temp.add(root.val);

        if(targetSum == sum && root.left == null && root.right == null){
            l.add(temp);
        }
        dfs(root.left, targetSum, sum, temp);
        dfs(root.right, targetSum, sum, temp);
    }
}