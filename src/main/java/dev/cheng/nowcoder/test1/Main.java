package dev.cheng.nowcoder.test1;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 10};
        int result = findMaxLenSubSequence(arr, 10);
        System.out.println(result);
    }

    //最长连续子序列
    //https://blog.nowcoder.net/n/dcfe044508fb4b3b8fa4a4ce900356d2
    public static int findMaxLenSubSequence(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    return j - i + 1;
                } else if (sum > target) {
                    sum = 0;
                    break;
                }
            }
        }
        return -1;
    }
}
