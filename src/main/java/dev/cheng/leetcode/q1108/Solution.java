package dev.cheng.leetcode.q1108;

// [1108] Defanging an IP Address
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

