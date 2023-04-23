package nowcoder.hj15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = Integer.parseInt(in.nextLine());
        String binaryString = Integer.toBinaryString(i);
        int count = 0;
        for (int i1 = 0; i1 < binaryString.length(); i1++) {
            if (binaryString.charAt(i1) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
