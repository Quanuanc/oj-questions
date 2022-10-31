package nowcoder.hj20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (checkLen(line) && checkCharKind(line) && checkSubstringRepeat(line)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    private static boolean checkSubstringRepeat(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            String last = str.substring(i + 3);
            if (last.contains(sub)) return false;
        }
        return true;
    }

    private static boolean checkLen(String str) {
        if (str == null) return false;
        if (str.length() <= 8) {
            return false;
        }
        return true;
    }

    private static boolean checkCharKind(String str) {
        char[] chars = str.toCharArray();
        int digit = 0, low = 0, upper = 0, other = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= '0' && ch <= '9') {
                digit = 1;
            } else if (ch >= 'a' && ch <= 'z') {
                low = 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                upper = 1;
            } else {
                other = 1;
            }
        }
        int total = digit + low + upper + other;
        if (total >= 3)
            return true;
        else
            return false;
    }
}
