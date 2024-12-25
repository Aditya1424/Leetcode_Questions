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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ll= new ArrayList<>();

        if(root==null){
            return new ArrayList<>();
        }

        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            int max= Integer.MIN_VALUE;

            for(int i=q.size()-1;i>=0;i--){
                TreeNode rv= q.remove();
                max= Math.max(max,rv.val);

                if(rv.left!=null){
                    q.add(rv.left);
                }

                if(rv.right!=null){
                    q.add(rv.right);
                }
            }

            ll.add(max);
        }
        return ll;
    }
}