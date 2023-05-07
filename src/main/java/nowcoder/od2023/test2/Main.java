package nowcoder.od2023.test2;

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
        List<Integer> img = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double minDiff = 129;
        Integer ans = null;
        for (int i = -127; i <= 128; i++) {
            double sum = 0;
            for (Integer item : img) {
                // 新图的像素值会自动截取到[0,255]
                int toBeAdded, newItem = item + i;
                toBeAdded = Math.max(0, Math.min(newItem, 255));
                sum += toBeAdded;
            }
            double avgDiff = Math.abs(sum / img.size() - 128); //平均值与128的差值
//            System.out.printf("ans: %d, diff: %.0f\n", i, avgDiff);
            if (avgDiff < minDiff) {
                minDiff = avgDiff;
                ans = i;
            } else if (avgDiff == minDiff && ans != null) {
                ans = Math.min(ans, i);
            }
        }
        System.out.println(ans);
    }

}
