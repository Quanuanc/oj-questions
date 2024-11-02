package dev.cheng.leetcode.q235;

import dev.cheng.leetcode.dsa.TreeNode;

// [235] 二叉搜索树的最近公共祖先
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) return root;

        if (p.val < root.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

