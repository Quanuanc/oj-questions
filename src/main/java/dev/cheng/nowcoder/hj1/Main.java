package dev.cheng.nowcoder.hj1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int index = line.lastIndexOf(' ');
        String lastWord = line.substring(index + 1);
        System.out.println(lastWord.length());
    }
}
