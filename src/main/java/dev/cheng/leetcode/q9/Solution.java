package dev.cheng.leetcode.q9;

// [9] 回文数
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x == 0) return true;

        int len = (int) Math.log10(x) + 1;
        int[] arr = new int[len];

        while (len > 0) {
            arr[len - 1] = (x % 10);
            x = x / 10;
            len--;
        }

        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j])
                return false;
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

