package leetcode.editor.cn;

/**
 * [28] 找出字符串中第一个匹配项的下标
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    public static void main(String[] args) {
        String hay = "leetcode", need = "leetco";
        int result = new FindTheIndexOfTheFirstOccurrenceInAString().new Solution().strStr(hay, need);
        System.out.println(result);
    }
}