package dev.cheng.nowcoder.hj67;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        int[] visit = new int[4];
        boolean flag = false;
        while (sc.hasNext()) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                visit[i] = 1;
                if (dfs(nums, visit, nums[i])) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag);
        }
        sc.close();
    }

    private static boolean dfs(int[] nums, int[] visit, int temp) {
        for (int i = 0; i < nums.length; i++) {
            if (visit[i] == 0) {
                visit[i] = 1;
                if (dfs(nums, visit, temp + nums[i])
                        || dfs(nums, visit, temp - nums[i])
                        || dfs(nums, visit, temp * nums[i])
                        || (temp % nums[i] == 0 && dfs(nums, visit, temp / nums[i]))) {
                    return true;
                }
                visit[i] = 0;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return temp == 24;
    }
}
