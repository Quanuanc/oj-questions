package nowcoder.hj31;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z')
                    && !(ch >= 'a' && ch <= 'z')) {
                sb.replace(i, i + 1, " ");
            }
        }

        String[] split = sb.toString().split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            System.out.print(split[i] + " ");
        }
    }
}
