package leetcode.editor.cn.q380;

import java.util.*;

class Solution {
    static
// [380] O(1) 时间插入、删除和获取随机元素
//leetcode submit region begin(Prohibit modification and deletion)
    class RandomizedSet {

        private final List<Integer> list;
        private final Map<Integer, Integer> map;
        private final Random random;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            int index = list.size();
            map.put(val, index);
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            int index = map.get(val);
            int last = list.get(list.size() - 1);
            list.set(index, last);
            map.put(last, index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }

        public int getRandom() {
            int i = random.nextInt(list.size());
            return list.get(i);
        }
    }

/*
  Your RandomizedSet object will be instantiated and called as such:
  RandomizedSet obj = new RandomizedSet();
  boolean param_1 = obj.insert(val);
  boolean param_2 = obj.remove(val);
  int param_3 = obj.getRandom();
 */
//leetcode submit region end(Prohibit modification and deletion)

}