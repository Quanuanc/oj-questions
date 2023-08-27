package leetcode.editor.cn;

import java.util.*;

/**
 * [49] 字母异位词分组
 */
public class GroupAnagrams {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> res = new ArrayList<>();
            if (0 == strs.length) return res;

            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String temp = new String(charArray);
                List<String> list = map.getOrDefault(temp, new ArrayList<>());
                list.add(str);
                map.put(temp, list);
            }
            res.addAll(map.values());
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
