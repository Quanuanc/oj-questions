// # 102
//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 620 👎 0


package leetcode.editor.cn;

import leetcode.dsa.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();

        // 建立一颗二叉树
        TreeNode root = new TreeNode(3);
        TreeNode rootL = new TreeNode(9);
        TreeNode rootR = new TreeNode(20);
        TreeNode rootRL = new TreeNode(15);
        TreeNode rootRR = new TreeNode(7);
        root.left = rootL;
        root.right = rootR;
        rootR.left = rootRL;
        rootR.right = rootRR;

        List<List<Integer>> result = solution.levelOrder(root);
        System.out.println(result);
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            List<TreeNode> list = new ArrayList<>();
            if (root == null)
                return result;
            list.add(root);
            while (!list.isEmpty()) {
                List<Integer> curList = new ArrayList<>();
                List<TreeNode> nextList = new ArrayList<>();
                for (TreeNode cur : list) {
                    curList.add(cur.val);
                    if (cur.left != null)
                        nextList.add(cur.left);
                    if (cur.right != null)
                        nextList.add(cur.right);
                }
                list = nextList;
                result.add(curList);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}