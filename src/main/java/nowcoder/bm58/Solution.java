package nowcoder.bm58;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0) return list;
        HashSet<String> set = new HashSet<>();
        addStr(set, str.toCharArray(), 0);
        list.addAll(set);
        return list;
    }

    void addStr(HashSet<String> set, char[] str, int k) {
        if (k == str.length) {
            set.add(new String(str));
            return;
        }
        for (int i = k; i < str.length; i++) {
            swap(str, i, k);
            addStr(set, str, k + 1);
            swap(str, i, k);
        }
    }

    void swap(char[] str, int i, int j) {
        if (i != j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }

    public static void main(String[] args) {
        String str = "aab";
        List<String> list = new Solution().Permutation(str);
        System.out.println(list);
    }
}
