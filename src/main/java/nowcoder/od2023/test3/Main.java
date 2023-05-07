package nowcoder.od2023.test3;

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
        int money = Integer.parseInt(input.nextLine());
        List<Integer> messages = Arrays.stream(input.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] dp = new int[money + 1];

        for (int i = 0; i <= messages.size(); i++) { // i->短信价格，j->手头的钱
            for (int j = 0; j <= money; j++) {
                if (i == 0 || j == 0 || j < i)
                    continue;
                int notSel = dp[j]; // 不选 手头钱的最优解
                int sel = dp[j - i] + messages.get(i - 1); // 选 dp[j - i] 手头钱-当前短信价格的最优解，message(i - 1)当前短信的条数
                dp[j] = Math.max(sel, notSel);
            }
        }

        System.out.println(dp[money]);
    }
}
