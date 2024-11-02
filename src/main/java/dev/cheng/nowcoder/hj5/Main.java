package dev.cheng.nowcoder.hj5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int result = 0;
        String temp = str.substring(2);
        int len = temp.length();
        int base = 0;
        for (int i = len - 1; i >= 0; i++) {
            int bit = convert(temp.charAt(i));
            if (base == 0) {
                result += bit;
            } else {
                result += bit * base;
            }
            base++;
        }
        System.out.println(result);
    }

    public static int convert(char ch) {
        char chl = Character.toLowerCase(ch);
        return 0;
//        return switch (chl) {
//            case '0' -> 0;
//            case '1' -> 1;
//            case '2' -> 2;
//            case '3' -> 3;
//            case '4' -> 4;
//            case '5' -> 5;
//            case '6' -> 6;
//            case '7' -> 7;
//            case '8' -> 8;
//            case '9' -> 9;
//            case 'a' -> 10;
//            case 'b' -> 11;
//            case 'c' -> 12;
//            case 'd' -> 13;
//            case 'e' -> 14;
//            case 'f' -> 15;
//            default -> 0;
//        };
    }
}
