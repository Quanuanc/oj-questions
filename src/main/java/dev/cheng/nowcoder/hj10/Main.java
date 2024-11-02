package dev.cheng.nowcoder.hj10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int[] map = new int[127];
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (map[c] == 0) {
                sum++;
                map[c] = 1;
            }
        }
        System.out.println(sum);
    }
}
