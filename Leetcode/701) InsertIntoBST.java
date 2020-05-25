/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        insert(root, val);
        return root;
    }
    public void insert(TreeNode root, int val){
        if(root==null)
            return;
        
        if(val>root.val){ 
            if(root.right==null){
                root.right = new TreeNode(val);
                return;
            }
            else insert(root.right, val);
        }
        if(val<root.val){
            if(root.left==null){
                root.left = new TreeNode(val);
                return;
            }
            else insert(root.left, val);
        }
    }
}