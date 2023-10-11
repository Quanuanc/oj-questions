package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

// [118] 杨辉三角
public class PascalsTriangle {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> resList = new ArrayList<>(numRows);
            for (int i = 1; i <= numRows; i++) {
                List<Integer> res = new ArrayList<>(i);
                if (i <= 2) {
                    for (int j = 0; j < i; j++) {
                        res.add(1);
                    }
                } else {
                    res.add(1);
                    List<Integer> prevRes = resList.get(i - 2);
                    for (int j = 0; j + 1 < prevRes.size(); j++) {
                        int toBeAdd = prevRes.get(j) + prevRes.get(j + 1);
                        res.add(toBeAdd);
                    }
                    res.add(1);
                }
                resList.add(res);
            }

            return resList;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
