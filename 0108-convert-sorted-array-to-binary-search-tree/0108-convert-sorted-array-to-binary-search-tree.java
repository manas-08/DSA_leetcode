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
    TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        populateSorted(nums);
        return root;
    }
    public void insert2(int value){ 
        root = insert2(value, root); 
        // so root's address is again assigned to the root variable
    }
    private TreeNode insert2(int val, TreeNode node){ // this is always returning node
        if(node == null){
            node = new TreeNode(val);
            return node;
        }
        if(val < node.val){
            node.left = insert2(val, node.left);
        }
        if(val > node.val){
            node.right = insert2(val, node.right);
        }
        return node;
    }
    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    public void populateSorted(int[] nums, int start, int end){ // if array is sorted then it will make a balanced tree.
        if(start >= end) return;

        int mid = start + (end-start)/2;
        this.insert2(nums[mid]);

        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
}