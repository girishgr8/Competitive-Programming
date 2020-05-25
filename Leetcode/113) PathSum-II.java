class Solution {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        DFS(root, new LinkedList<Integer>(), 0, sum);
        return result;
    }
    public void DFS(TreeNode root, LinkedList<Integer> list, int curr, int sum){
        if(root==null)
            return;
        curr+=root.val;
        list.add(root.val);
        if(root.left==null && root.right==null && curr==sum)
            /* We have to add a copy of the list into result since, in further recursion it will be modified*/
            result.add(new LinkedList<Integer>(list));
        /* Recurse the left subtree */
        DFS(root.left, list, curr, sum);
        /* Recurse the right subtree */
        DFS(root.right, list, curr, sum);
        /* Remove the last inserted node from the list*/
        list.remove(list.size()-1);
    }
}