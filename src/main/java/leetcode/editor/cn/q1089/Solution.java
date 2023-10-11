package leetcode.editor.cn.q1089;

// [1089] Duplicate Zeros
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int len = arr.length - 1;
        for (int left = 0; left <= len - possibleDups; left++) {
            if (arr[left] == 0) {
                if (left == len - possibleDups) {
                    arr[len] = 0;
                    len--;
                    break;
                }
                possibleDups++;
            }
        }
        int last = len - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

