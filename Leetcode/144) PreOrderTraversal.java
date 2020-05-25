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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<Integer>();
        preorder(root, ls);
        return ls;
    }
    public void preorder(TreeNode root, List<Integer> ls){
        if(root==null)
            return;
        ls.add(root.val);
        preorder(root.left, ls);
        preorder(root.right, ls);
    }
}