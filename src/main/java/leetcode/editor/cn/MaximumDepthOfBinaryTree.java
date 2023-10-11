package leetcode.editor.cn;

import dsa.TreeNode;

// [104] 二叉树的最大深度
public class MaximumDepthOfBinaryTree {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int maxDepth(TreeNode root) {
            return dfs(root);
        }

        public int dfs(TreeNode node) {
            if (node == null) return 0;
            else {
                int leftH = dfs(node.left);
                int rightH = dfs(node.right);
                return Math.max(leftH, rightH) + 1;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}