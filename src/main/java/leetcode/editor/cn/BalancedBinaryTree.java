package leetcode.editor.cn;

import dsa.TreeNode;

// [110] 平衡二叉树
public class BalancedBinaryTree {
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
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            return Math.abs(lDepth - rDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

        private int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}