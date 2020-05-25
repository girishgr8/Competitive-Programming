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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return checkMirror(root.left, root.right);
    }
    public boolean checkMirror(TreeNode lt, TreeNode rt){
        if(lt==null && rt==null)
            return true;
        if((lt!=null && rt==null) || (lt==null && rt!=null))
           return false;
        if(lt.val==rt.val && checkMirror(lt.left,rt.right) && checkMirror(lt.right,rt.left))
            return true;
        return false;
    }
}