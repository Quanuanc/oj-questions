package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * [57] 插入区间
 */
public class InsertInterval {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            int left = newInterval[0];
            int right = newInterval[1];
            boolean placed = false;
            List<int[]> ansList = new ArrayList<>();
            for (int[] interval : intervals) {
                if (interval[0] > right) {
                    if (!placed) {
                        ansList.add(new int[]{left, right});
                        placed = true;
                    }
                    ansList.add(interval);
                } else if (interval[1] < left) {
                    ansList.add(interval);
                } else {
                    left = Math.min(left, interval[0]);
                    right = Math.max(right, interval[1]);
                }
            }
            if (!placed) {
                ansList.add(new int[]{left, right});
            }
            int[][] ans = new int[ansList.size()][2];
            for (int i = 0; i < ansList.size(); ++i) {
                ans[i] = ansList.get(i);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}