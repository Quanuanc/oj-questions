package dev.cheng.leetcode.q1108;
// {1205} {defanging-an-ip-address}

// [1108] Defanging an IP Address
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if ('.' == c) {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

