package leetcode.editor.cn.q347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// [347] 前 K 个高频元素
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }
        return listToArray(getTopKKeys(map, k));
    }

    private List<Integer> getTopKKeys(Map<Integer, Integer> map, int k) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i == k) break;
            Map.Entry<Integer, Integer> entry = list.get(i);
            res.add(entry.getKey());
        }
        return res;
    }

    private int[] listToArray(List<Integer> list) {
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


