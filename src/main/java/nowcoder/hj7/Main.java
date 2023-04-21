package nowcoder.hj7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        double val = Double.parseDouble(input);
        long ret = Math.round(val);
        System.out.println(ret);
    }
}
