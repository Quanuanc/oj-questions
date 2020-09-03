// # 144
//给定一个二叉树，返回它的 前序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [1,2,3]
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 356 👎 0


package leetcode.editor.cn;

import leetcode.dsa.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePreorderTraversal().new Solution();
    }
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
        List<Integer> preorder = new ArrayList<>();

        public List<Integer> preorderTraversal(TreeNode root) {
            if (root == null) {
                return preorder;
            }
            preorder.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return preorder;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)

}