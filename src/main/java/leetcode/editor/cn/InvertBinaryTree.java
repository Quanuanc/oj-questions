package leetcode.editor.cn;

import dsa.TreeNode;

// [226] 翻转二叉树
public class InvertBinaryTree {
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
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            else {
                if (root.left != null) invertTree(root.left);
                if (root.right != null) invertTree(root.right);
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}