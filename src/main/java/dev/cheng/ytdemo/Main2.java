package dev.cheng.ytdemo;

public class Main2 {
    public static void main(String[] args) {
        int[] arr2 = new int[]{4, 1, 1, 9, 1};
        System.out.println(dpOpt(arr2));
    }

    private static int recurDp(int[] arr, int i) {
        if (i == 0) return arr[i];
        else if (i == 1) {
            return Math.max(arr[0], arr[i]);
        } else {
            int A = recurDp(arr, i - 2) + arr[i];
            int B = recurDp(arr, i - 1);
            return Math.max(A, B);
        }
    }

    private static int dpOpt(int[] arr) {
        int[] opt = new int[arr.length];
        opt[0] = arr[0];
        opt[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < opt.length; i++) {
            int A = opt[i - 2] + arr[i];
            int B = opt[i - 1];
            opt[i] = Math.max(A, B);
        }
        return opt[arr.length - 1];
    }

}
