package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [剑指 Offer 48] 最长不含重复字符的子字符串
 */
public class ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Queue<Character> queue = new LinkedList<>();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                while (queue.contains(c)) {
                    queue.poll();
                }
                queue.add(c);
                res = Math.max(res, queue.size());
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}