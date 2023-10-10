package leetcode.editor.cn;

import dsa.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * [94] 二叉树的中序遍历
 */
public class BinaryTreeInorderTraversal {
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
        private final List<Integer> list = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) {
                return list;
            }
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}