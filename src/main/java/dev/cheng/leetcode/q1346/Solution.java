package dev.cheng.leetcode.q1346;

import java.util.HashMap;
import java.util.Map;


// [1346] Check If N and Its Double Exist
class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) continue;
            if (map.containsKey(arr[i] / 2)) {
                int j = map.get(arr[i] / 2);
                if (i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}

