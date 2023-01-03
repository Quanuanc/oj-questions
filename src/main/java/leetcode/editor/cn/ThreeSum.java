package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [15] 三数之和
 */
public class ThreeSum {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int len = nums.length;
            if (len < 3) {
                return new ArrayList<>();
            }

            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) return result;
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int left = i + 1;
                int right = len - 1;
                while (left < right) {
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        List<Integer> tRes = new ArrayList<>();
                        tRes.add(nums[i]);
                        tRes.add(nums[left]);
                        tRes.add(nums[right]);
                        result.add(tRes);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left = left + 1;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right = right - 1;
                        }
                        left = left + 1;
                        right = right + 1;
                    } else if (nums[i] + nums[left] + nums[right] > 0) {
                        right = right - 1;
                    } else {
                        left = left + 1;
                    }
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}