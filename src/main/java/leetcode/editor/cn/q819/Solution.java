package leetcode.editor.cn.q819;

import java.util.HashMap;
import java.util.Map;

// [819] 最常见的单词
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W");
        Map<String, Integer> strCountMap = new HashMap<>();
        for (String word : words) {
            if (strCountMap.containsKey(word)) {
                strCountMap.put(word, strCountMap.get(word) + 1);
            } else {
                strCountMap.put(word, 1);
            }
        }
        for (String banWord : banned) {
            strCountMap.remove(banWord);
        }
        strCountMap.remove("");
        int max = 0;
        StringBuilder maxKey = new StringBuilder();
        for (Map.Entry<String, Integer> entry : strCountMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey.replace(0, maxKey.length(), entry.getKey());
            }
        }
        return maxKey.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
