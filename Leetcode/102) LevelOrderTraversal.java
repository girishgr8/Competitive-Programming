/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<Integer> qd = new LinkedList<Integer>();
        Queue<Integer> qdc = new LinkedList<Integer>();
        Vector<Integer> store = new Vector<Integer>();
        if(root==null)
            return result;
        q.add(root);
        qd.add(0);
        qdc.add(0);
        int depth = 0;
        while(!q.isEmpty()){
            root = q.poll();
            depth = qd.poll();
            if(root.left!=null){
                q.add(root.left);
                qd.add(depth+1);
                qdc.add(depth+1);
            }
            if(root.right!=null){
                q.add(root.right);
                qd.add(depth+1);
                qdc.add(depth+1);
            }
            store.add(root.val);
        }
        depth = 0;
        List<Integer> ls = new ArrayList<Integer>();
        while(!qdc.isEmpty()){
            int curr_depth = qdc.poll();
            if(depth!=curr_depth){
                result.add(ls);
                ls = new ArrayList<Integer>();
                depth = curr_depth;
            }
            ls.add(store.remove(0));
        }
        result.add(ls);
        return result;        
    }
}
