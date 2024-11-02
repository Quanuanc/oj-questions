package dev.cheng.leetcode.q438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// [438] 找到字符串中所有字母异位词
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) return new ArrayList<>();
        Map<Character, Integer> pMap = getCharCountMap(p);
        List<Integer> res = new ArrayList<>();
        int pLen = p.length();
        Map<Character, Integer> subMap = null;
        for (int i = 0; i < s.length() - pLen + 1; i++) {
            String sub = s.substring(i, i + pLen);
            if (i == 0) {
                subMap = getCharCountMap(sub);
            } else {
                char oldStart = s.charAt(i - 1);
                char newEnd = s.charAt(i + pLen - 1);
                updateCharCountMap(oldStart, newEnd, subMap);
            }
            if (subMap.equals(pMap)) {
                res.add(i);
            }
        }
        return res;
    }

    private void updateCharCountMap(char oldStart, char newEnd, Map<Character, Integer> oldMap) {
        int oldStartCount = oldMap.get(oldStart);
        oldStartCount--;
        if (oldStartCount == 0) {
            oldMap.remove(oldStart);
        } else {
            oldMap.put(oldStart, oldStartCount);
        }
        if (oldMap.containsKey(newEnd)) {
            oldMap.put(newEnd, oldMap.get(newEnd) + 1);
        } else {
            oldMap.put(newEnd, 1);
        }
    }

    private Map<Character, Integer> getCharCountMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

