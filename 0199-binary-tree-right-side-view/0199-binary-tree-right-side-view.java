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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result; //  empty list

        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root); // root node
        while(!queue.isEmpty()){
            int currLevelSize = queue.size();
            List<Integer> currLevelList = new ArrayList<>(currLevelSize);
            for (int i = 0; i < currLevelSize; i++){
                // -> denoting that it is visited
                TreeNode curr = queue.poll();
                if(i==currLevelSize-1) result.add(curr.val); // it its the last
                currLevelList.add(curr.val);
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
        }
        return result;
    }
}