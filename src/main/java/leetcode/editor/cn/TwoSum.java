package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (hashMap.containsKey(target - nums[i])) {
                    return new int[]{hashMap.get(target - nums[i]), i};
                }
                hashMap.put(nums[i], i);
            }
            return new int[]{0, 0};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}