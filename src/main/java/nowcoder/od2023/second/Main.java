package nowcoder.od2023.second;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @see <a href="https://wiki.amoscloud.com/zh/ProgramingPractice/NowCoder/Adecco/Topic0185">题目</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> img = Arrays.stream(input.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double mm = 256;
        Integer ans = null;
        for (int i = -127; i <= 128; i++) {
            double sum = 0;
            for (Integer integer : img) {
                sum += Math.max(0, Math.min(integer + i, 255));
            }
            double diff = Math.abs(sum / img.size() - 128);
            if (diff < mm) {
                mm = diff;
                ans = i;
            } else if (diff == mm && ans != null) {
                ans = Math.min(ans, i);
            }
        }
        System.out.println(ans);
    }

}
