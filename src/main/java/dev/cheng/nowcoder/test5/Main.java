package dev.cheng.nowcoder.test5;

import java.util.Scanner;

public class Main {
    public static int[] score;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stuNum = sc.nextInt();
        int stepNum = sc.nextInt();

        score = new int[stuNum];

        for (int i = 0; i < stuNum; i++) {
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < stepNum; i++) {
            String line = sc.nextLine();
            parseInput(line);
        }
    }

    public static void parseInput(String str) {
        if (!str.equals("")) {
            char startChar = str.charAt(0);
            if (startChar == 'Q') {
                String start = str.substring(2, 3);
                String end = str.substring(4, 5);
                int startNum = Integer.parseInt(start);
                int endNum = Integer.parseInt(end);
                int max = -1;
                for (int i = startNum - 1; i < endNum; i++) {
                    if (score[i] > max) max = score[i];
                }
                System.out.println(max);
            } else {
                String index = str.substring(2, 3);
                String newScore = str.substring(4, 5);
                int indexNum = Integer.parseInt(index);
                int newScoreNum = Integer.parseInt(newScore);
                score[indexNum - 1] = newScoreNum;
            }
        }
    }
}