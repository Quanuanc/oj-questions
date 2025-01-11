package dev.cheng.leetcode.q69;


// [69] x 的平方根 
class Solution {
    private int s = 0;

    public int mySqrt(int x) {
        if (x == 0) return s;
        s = x;
        return (int) sqrt(x);
    }

    private double sqrt(double x) {
        double res = (x + s / x) / 2;
        if (res == x) {
            return x;
        } else {
            return sqrt(res);
        }
    }
}
