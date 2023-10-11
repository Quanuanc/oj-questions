package leetcode.editor.cn.q1592;

// [1592] 重新排列单词间的空格
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reorderSpaces(String text) {
        String[] tList = text.trim().split("\\s+");

        int spaceLen = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (' ' == c) spaceLen++;
        }
        if (tList.length == 1) {
            return tList[0] + " ".repeat(spaceLen);
        }

        int avgSpaceLen = spaceLen / (tList.length - 1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < tList.length; i++) {
            String s = tList[i];
            result.append(s);
            if (i <= tList.length - 2) {
                result.append(" ".repeat(Math.max(0, avgSpaceLen)));
            } else if (i == tList.length - 1) {
                int appendedLen = avgSpaceLen * i;
                int lastLen = spaceLen - appendedLen;
                result.append(" ".repeat(Math.max(0, lastLen)));
            }
        }

        return result.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)


