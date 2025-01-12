package dev.cheng.leetcode.q13;
// {13} {roman-to-integer}

// [13] Roman to Integer
class Solution {
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000
    // I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    // X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
    // C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int add = 0;
            switch (c) {
                case 'I' -> {
                    if (check(s, i, 'V')) {
                        i++;
                        add = 4;
                    } else if (check(s, i, 'X')) {
                        i++;
                        add = 9;
                    } else add = 1;
                }
                case 'X' -> {
                    if (check(s, i, 'L')) {
                        i++;
                        add = 40;
                    } else if (check(s, i, 'C')) {
                        i++;
                        add = 90;
                    } else add = 10;
                }
                case 'C' -> {
                    if (check(s, i, 'D')) {
                        i++;
                        add = 400;
                    } else if (check(s, i, 'M')) {
                        i++;
                        add = 900;
                    } else add = 100;
                }
                case 'V' -> add = 5;
                case 'L' -> add = 50;
                case 'D' -> add = 500;
                case 'M' -> add = 1000;
            }
            res += add;
        }
        return res;
    }

    private boolean check(String s, int index, char target) {
        if (index + 1 >= s.length()) {
            return false;
        }
        return s.charAt(index + 1) == target;
    }
}


