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
    public TreeNode reverseOddLevels(TreeNode root) {
        
        Queue<TreeNode> q= new LinkedList<>();
        int lvl= 0;

        q.add(root);

        while(!q.isEmpty()){

            TreeNode arr[]= new TreeNode[q.size()];

            for(int i=q.size()-1;i>=0;i--){

                TreeNode rv= q.remove();
                arr[i]= rv;

                if(rv.left!=null){
                    q.add(rv.left);
                }

                if(rv.right!=null){
                    q.add(rv.right);
                }

            }

            if(lvl%2==1){
                reverse(arr);
            }
            lvl++;
        }

        return root;
    }


    public static void reverse(TreeNode arr[]){

        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp= arr[i].val;
            arr[i].val= arr[j].val;
            arr[j].val= temp;
            i++;
            j--;
        }
    }
}