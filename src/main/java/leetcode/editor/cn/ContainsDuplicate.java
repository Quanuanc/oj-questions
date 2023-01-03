package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * [217] 存在重复元素
 */
public class ContainsDuplicate {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        Set<Integer> set = new HashSet<>();

        public boolean containsDuplicate(int[] nums) {
            for (int num : nums) {
                if (set.contains(num))
                    return true;
                else
                    set.add(num);
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}