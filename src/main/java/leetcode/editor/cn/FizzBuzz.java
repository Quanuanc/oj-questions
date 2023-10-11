package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

// [412] Fizz Buzz
public class FizzBuzz {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    result.add("Fizz");
                } else if (i % 5 == 0) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(i));
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}