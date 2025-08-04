/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return null;
        Queue<Node> queue= new LinkedList<>();
        queue.offer(root); // root node
        root.next=null;
        while(!queue.isEmpty()){
            int currLevelSize = queue.size();
            for (int i = 0; i < currLevelSize; i++){
                // -> denoting that it is visited
                Node curr = queue.poll();
                if(i != currLevelSize-1) curr.next = queue.peek();
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
        }
        return root;
    }
}