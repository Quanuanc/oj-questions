package dev.cheng.leetcode.q404;

import dev.cheng.leetcode.dsa.TreeNode;

// [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return dfs(root);
    }

    private int dfs(TreeNode node) {
        int res = 0;
        if (node.left != null) {
            if (isLeaf(node.left)) {
                res += node.left.val;
            } else {
                res += dfs(node.left);
            }
        }

        if (node.right != null && !isLeaf(node.right)) {
            res += dfs(node.right);
        }
        return res;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

