package leetcode.editor.cn.q191;

// [191] 位1的个数
//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int bits = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1')
                bits++;
        }
        return bits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

