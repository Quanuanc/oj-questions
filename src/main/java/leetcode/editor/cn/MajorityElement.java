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
            for (int i = 0; i < nums.length; i++) {
                if (!check.containsKey(nums[i])) {
                    check.put(nums[i], 1);
                } else {
                    check.put(nums[i], check.get(nums[i]) + 1);
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

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        int result = new MajorityElement().new Solution().majorityElement(nums);
        System.out.println(result);
    }
}