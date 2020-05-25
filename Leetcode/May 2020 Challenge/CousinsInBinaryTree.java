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
class Node{
    int parent, depth;
    Node(int parent, int depth){
        this.parent = parent;
        this.depth = depth;
    }
}

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Node[] arr = new Node[101];
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<Integer> d = new LinkedList<Integer>();
        q.add(root);
        d.add(0);
        arr[root.val] = new Node(-1, 0);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            int depth = d.poll();
            if(node.left!=null){
                arr[node.left.val] = new Node(node.val, depth+1);
                q.add(node.left);
                d.add(depth+1);
            }
            if(node.right!=null){
                arr[node.right.val] = new Node(node.val, depth+1);
                q.add(node.right);
                d.add(depth+1);
            }
        }
        if(arr[x].parent!=arr[y].parent && arr[x].depth==arr[y].depth)
            return true;
        return false;
    }
}