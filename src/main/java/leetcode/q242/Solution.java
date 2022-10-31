package leetcode.q242;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        else if (s.length() == 1) {
            return s.equals(t);
        } else {
            StringBuilder ss = new StringBuilder(s);
            StringBuilder tt = new StringBuilder(t);
            for (int i = 0; i < ss.length(); i++) {
                char current = ss.charAt(i);
                if (current == ' ') continue;
                if (count(ss, current) != count(tt, current)) return false;
            }
            return true;
        }
    }

    private int count(StringBuilder s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                s.setCharAt(i, ' ');
                count++;
            }
        }
        return count;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sTable = new int[26];
        int[] tTable = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sTable[s.charAt(i) - 'a']++;
            tTable[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < sTable.length; i++) {
            if (sTable[i] != tTable[i]) {
                return false;
            }
        }
        return true;
    }
}
