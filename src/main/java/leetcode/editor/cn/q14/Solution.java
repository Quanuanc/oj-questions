package leetcode.editor.cn.q14;


// [14] 最长公共前缀
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        String longest = "";
        char first;
        char cur;
        exit:
        for (int i = 0; i < 200; i++) {
            if (i >= strs[0].length()) {
                break;
            }
            first = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    longest = strs[j];
                    break exit;
                } else {
                    cur = strs[j].charAt(i);
                    if (cur != first) {
                        break exit;
                    }
                    if (j == strs.length - 1)
                        longest = strs[0].substring(0, i + 1);
                }
            }
        }
        return longest;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
