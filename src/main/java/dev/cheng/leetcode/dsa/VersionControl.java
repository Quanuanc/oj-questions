package dev.cheng.leetcode.dsa;

import java.util.Random;

public class VersionControl {
    Random random = new Random();

    public boolean isBadVersion(int version) {
        return random.nextBoolean();
    }
}
