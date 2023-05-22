package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * [380] O(1) 时间插入、删除和获取随机元素
 */
public class InsertDeleteGetrandomO1 {
    //leetcode submit region begin(Prohibit modification and deletion)
    class RandomizedSet {

        private final List<Integer> list = new ArrayList<>();

        public RandomizedSet() {
        }

        public boolean insert(int val) {
            for (Integer item : list) {
                if (item == val)
                    return false;
            }
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            for (int i = 0; i < list.size(); i++) {
                if (val == list.get(i)) {
                    list.remove(i);
                    return true;
                }
            }
            return false;
        }

        public int getRandom() {
            Random random = new Random();
            int i = random.nextInt(list.size());
            return list.get(i);
        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
//leetcode submit region end(Prohibit modification and deletion)

}