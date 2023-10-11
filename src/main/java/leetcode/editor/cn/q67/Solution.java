package leetcode.editor.cn.q67;

// [67] 二进制求和
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        StringBuilder result = new StringBuilder();

        char rc, carry = '0';
        for (int i = 0; i < maxLen; i++) {
            char ac = '0', bc = '0';

            int aIndex = a.length() - 1 - i;
            int bIndex = b.length() - 1 - i;

            if (aIndex >= 0) {
                ac = a.charAt(aIndex);
            }
            if (bIndex >= 0) {
                bc = b.charAt(bIndex);
            }

            char[] addRes = add(ac, bc, carry);
            rc = addRes[0];
            carry = addRes[1];

            result.append(rc);
        }

        if (carry != '0') result.append(carry);

        return result.reverse().toString();
    }

    public char[] add(char ac, char bc, char carry) {
        char rc;
        int count = 0;
        if (ac == '1') {
            count++;
        }
        if (bc == '1') {
            count++;
        }
        if (carry == '1') {
            count++;
        }

        if (count == 3) {
            rc = '1';
        } else if (count == 2) {
            rc = '0';
            carry = '1';
        } else if (count == 1) {
            rc = '1';
            carry = '0';
        } else {
            rc = '0';
            carry = '0';
        }

        return new char[]{rc, carry};
    }
}
//leetcode submit region end(Prohibit modification and deletion)


