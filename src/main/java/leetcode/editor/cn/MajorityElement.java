package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * [169] 多数元素
 */
public class MajorityElement {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            int threshold = nums.length / 2;
            Map<Integer, Integer> check = new HashMap<>();
            for (int num : nums) {
                if (!check.containsKey(num)) {
                    check.put(num, 1);
                } else {
                    check.put(num, check.get(num) + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : check.entrySet()) {
                if (entry.getValue() > threshold) {
                    return entry.getKey();
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}