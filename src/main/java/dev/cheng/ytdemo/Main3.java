package dev.cheng.ytdemo;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 34, 4, 12, 5, 2};
        System.out.println(recurSubset(arr, arr.length - 1, 9));
        System.out.println(recurSubset(arr, arr.length - 1, 13));
    }

    private static boolean recurSubset(int[] arr, int i, int target) {
        if (target == 0)
            return true;
        else if (i == 0)
            return arr[i] == target;
        else if (arr[i] > target)
            return recurSubset(arr, i - 1, target);
        else {
            boolean A = recurSubset(arr, i - 1, target - arr[i]);
            boolean B = recurSubset(arr, i - 1, target);
            return A || B;
        }
    }
}
