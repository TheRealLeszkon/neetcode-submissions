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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return new ArrayList<>();
        queue.offer(root);
        int currentLevel =0;
        while(!queue.isEmpty()){
            int len = queue.size();
            result.add(new ArrayList<>());
            for(int i=0;i<len;i++){
                TreeNode popped = queue.poll();
                result.get(currentLevel).add(popped.val);

                if(popped.left != null) queue.offer(popped.left);
                if(popped.right != null) queue.offer(popped.right);

            }
            currentLevel++;
        }
        return result;
    }
}
