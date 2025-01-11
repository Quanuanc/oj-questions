package dev.cheng.leetcode.q104;

import dev.cheng.leetcode.dsa.TreeNode;

// [104] 二叉树的最大深度

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

