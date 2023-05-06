package nowcoder.dp41;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = parseLine(scanner);
        int n = first[0], V = first[1];

        int[] sizeList = new int[n + 1];
        int[] valueList = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int[] parse = parseLine(scanner);
            sizeList[i] = parse[0];
            valueList[i] = parse[1];
        }

        int[] dp1 = new int[V + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = V; j >= sizeList[i]; j--) {
                int notSelect = dp1[j];
                int select = dp1[j - sizeList[i]] + valueList[i];
                dp1[j] = Math.max(notSelect, select);
            }
        }
        System.out.println(dp1[V]);


        int[] dp2 = new int[V + 1];
        Arrays.fill(dp2, Integer.MIN_VALUE);
        dp2[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = V; j >= sizeList[i]; j--) {
                int notSelect = dp2[j];
                int select = dp2[j - sizeList[i]] + valueList[i];
                dp2[j] = Math.max(notSelect, select);
            }
        }
        if (dp2[V] < 0) {
            dp2[V] = 0;
        }
        System.out.println(dp2[V]);
    }

    private static int[] parseLine(Scanner scanner) {
        String line = scanner.nextLine();
        List<Integer> firstNum = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Integer i = firstNum.get(0);
        Integer j = firstNum.get(1);

        return new int[]{i, j};
    }
}
