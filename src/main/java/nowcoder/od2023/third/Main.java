package nowcoder.od2023.third;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @see <a href="https://wiki.amoscloud.com/zh/ProgramingPractice/NowCoder/Adecco/Topic0151">题目</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myMoney = Integer.parseInt(input.nextLine());
        List<Integer> messages = Arrays.stream(input.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] dp = new int[myMoney + 1];
        for (int i = 0; i <= messages.size(); i++) {
            for (int j = 0; j <= myMoney; j++) {
                if (i == 0 || j == 0 || j < i) {
                    continue;
                }
                int A = dp[j];
                int B = dp[j - i] + messages.get(i - 1);
                dp[j] = Math.max(A, B);
            }
        }

        System.out.println(dp[myMoney]);
    }
}
