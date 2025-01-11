package dev.cheng.leetcode.q415;


// [415] 字符串相加
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int res = x + y + add;
            sb.append(res % 10);
            add = res / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
