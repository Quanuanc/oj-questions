package nowcoder.test2;

import java.util.Scanner;

public class Main {
    private static int change = 0;
    private static int last = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int empty = sc.nextInt();
            if (empty == 0) break;
            System.out.println(count(empty));
        }
    }

    private static int count(int empty) {
        if (empty % 3 == 2) change++;
        change = empty / 3;
        last = empty % 3;
        empty /= 3;
        return 1;
    }
}
