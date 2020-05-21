// # 747
//在一个给定的数组nums中，总是存在一个最大元素 。 
//
// 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。 
//
// 如果是，则返回最大元素的索引，否则返回-1。 
//
// 示例 1: 
//
// 输入: nums = [3, 6, 1, 0]
//输出: 1
//解释: 6是最大的整数, 对于数组中的其他整数,
//6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
// 
//
// 
//
// 示例 2: 
//
// 输入: nums = [1, 2, 3, 4]
//输出: -1
//解释: 4没有超过3的两倍大, 所以我们返回 -1.
// 
//
// 
//
// 提示: 
//
// 
// nums 的长度范围在[1, 50]. 
// 每个 nums[i] 的整数范围在 [0, 100]. 
// 
// Related Topics 数组


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        Solution solution = new LargestNumberAtLeastTwiceOfOthers().new Solution();
        int[] nums = {0,0,0,1};
        System.out.println(solution.dominantIndex(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int dominantIndex(int[] nums) {
            List<Integer> numsList = new ArrayList<>();
            for (int x : nums)
                numsList.add(x);
            if (nums.length < 2)
                return 0;
            int[] numsTemp = Arrays.copyOf(nums, nums.length);
            Arrays.sort(numsTemp);
            if (numsTemp[nums.length - 1] >= 2 * numsTemp[nums.length - 2])
                return numsList.indexOf(numsTemp[nums.length - 1]);
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}