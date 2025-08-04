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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; //  empty list
        // maintain a reverse flag initially set it false
        boolean reverse = false;
        Deque<TreeNode> queue= new LinkedList<>();
        queue.offer(root); // root node
        while(!queue.isEmpty()){
            int currLevelSize = queue.size();
            ArrayList<Integer> currLevelList = new ArrayList<>(currLevelSize);
            for (int i = 0; i < currLevelSize; i++){
                if(!reverse){
                    // -> denoting that it is visited
                    TreeNode curr = queue.pollFirst();
                    currLevelList.add(curr.val);
                    if(curr.left != null){
                        queue.offerLast(curr.left);
                    }
                    if(curr.right != null){
                        queue.offerLast(curr.right);
                    }
                }
                else{
                    // -> denoting that it is visited
                    TreeNode curr = queue.pollLast();
                    currLevelList.add(curr.val);
                    if(curr.right != null){
                        queue.offerFirst(curr.right);
                    }
                    if(curr.left != null){
                        queue.offerFirst(curr.left);
                    }
                }
            } 
            reverse = !reverse;
            result.add(currLevelList);
        }
        return result;
    }
}