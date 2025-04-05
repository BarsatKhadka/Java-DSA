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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int qLength = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0; i<qLength; i++){
                TreeNode node = q.poll();
                if(node !=null){
                    q.add(node.left);
                    q.add(node.right);
                }
                if(node!=null){
                level.add(node.val);
                }
            }
            if(!level.isEmpty()){
            res.add(level);
            }
        }
        Collections.reverse(res);
        return res;

        
    }
}