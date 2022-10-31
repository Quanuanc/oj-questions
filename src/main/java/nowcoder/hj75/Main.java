package nowcoder.hj75;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sub = sc.nextLine();
        String str = sc.nextLine();

        int maxLen = 0;
        for (int i = 0; i <= sub.length(); i++) {
            for (int j = i + 1; j <= sub.length(); j++) {
                String temp = sub.substring(i, j);
                if (str.contains(temp)) {
                    if (temp.length() > maxLen)
                        maxLen = temp.length();
                }
            }
        }

        System.out.println(maxLen);
    }
}
