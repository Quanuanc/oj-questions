package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int need = target - nums[i];
                if (map.containsKey(need)) {
                    result[0] = map.get(need);
                    result[1] = i;
                }
                map.put(nums[i], i);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}