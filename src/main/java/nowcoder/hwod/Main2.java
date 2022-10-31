package nowcoder.hwod;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String l = sc.nextLine();
        int index = index(s, l);
        System.out.println(index);
    }

    public static int indexLast(String s, String l) {
        int sLen = s.length(), lLen = l.length();
        int j = 0, k = 0;
        while (j < sLen && k < lLen) {
            if (s.charAt(j) == l.charAt(k)) {
                j += 1;
            }
            k += 1;
        }
        if (j == sLen) {
            return l.indexOf(s.charAt(sLen - 1));
        } else {
            return -1;
        }
    }

    public static int index(String s, String l) {
        if (isSeq(s, l)) {
            char c = s.charAt(s.length() - 1);
            return l.lastIndexOf(c);
        } else
            return -1;
    }

    public static boolean isSeq(String s, String l) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = l.indexOf(c, index + 1);
            if (index == -1) return false;
        }
        return true;
    }
}
