package leetcode.editor.cn;

public class ReplaceElementsWithGreatestElementOnRightSide {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //TODO
        public int[] replaceElements(int[] arr) {
            int len = arr.length;
            if (len == 1)
                return new int[]{-1};

            int[] max = findMax(arr, 0);
            for (int i = 0; i < len; i++) {
                if (i < max[1]) {
                    arr[i] = max[0];
                } else {
                    max = findMax(arr, i);
                    arr[i] = max[0];
                }
            }
            return arr;
        }

        public int[] findMax(int[] arr, int start) {
            int[] result = new int[2];
            for (int i = start + 1; i < arr.length; i++) {
                if (arr[i] > result[0]) {
                    result[0] = arr[i];
                    result[1] = i;
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}