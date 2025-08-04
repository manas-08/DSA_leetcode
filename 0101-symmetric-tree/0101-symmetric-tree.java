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
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }   // bases cases
        if(root.left == null || root.right == null) return false;

        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int currLevelSize = queue.size();
            ArrayList<TreeNode> currLevelList = new ArrayList<>();
            for (int i = 0; i < currLevelSize; i++){
                // -> denoting that it is visited
                TreeNode curr = queue.poll();
                currLevelList.add(curr);
                if(curr != null){
                queue.offer(curr.left);
                queue.offer(curr.right);
                }
            }
            System.out.println(queue);
            for(int i = 0; i < currLevelList.size()/2; i++){
                TreeNode left = currLevelList.get(i);
                TreeNode right = currLevelList.get(currLevelList.size() - i - 1);

                if (left == null && right == null) continue;
                if (left == null || right == null) return false;
                if (left.val != right.val) return false;
            }
        }
        return true;
    }
}