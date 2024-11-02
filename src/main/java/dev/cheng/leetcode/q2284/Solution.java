package dev.cheng.leetcode.q2284;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;

/**
 * 2284. Sender With Largest Word Count
 */
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> senderCount = new HashMap<>();
        for (int i = 0, sendersLength = senders.length; i < sendersLength; i++) {
            String sender = senders[i];
            String message = messages[i];
            int length = calLength(message);
            senderCount.put(sender, senderCount.getOrDefault(sender, 0) + length);
        }

        Optional<Map.Entry<String, Integer>> maxEntry = senderCount.entrySet()
                .stream()
                .max(Map.Entry.<String, Integer> comparingByValue()
                        .thenComparing(Entry::getKey, String::compareTo));

        if (maxEntry.isPresent()) {
            return maxEntry.get().getKey();
        } else {
            return "";
        }
    }

    private int calLength(String message) {
        if (Objects.isNull(message)) {
            return 0;
        }
        int spaces = 0;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (' ' == c) {
                spaces++;
            }
        }
        return spaces + 1;
    }
}
