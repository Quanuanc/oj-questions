package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * [383] 赎金信
 */
public class RansomNote {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> maps = new HashMap<>();
            for (char c : magazine.toCharArray()) {
                maps.put(c, maps.get(c) == null ? 1 : maps.get(c) + 1);
            }
            for (char c : ransomNote.toCharArray()) {
                if (maps.get(c) == null || maps.get(c) <= 0) {
                    return false;
                } else {
                    maps.put(c, maps.get(c) - 1);
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}