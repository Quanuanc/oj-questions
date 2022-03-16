package q1089;

import java.util.Arrays;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int len = arr.length - 1;
        for (int left = 0; left <= len - possibleDups; left++) {
            if (arr[left] == 0) {
                if (left == len - possibleDups) {
                    arr[len] = 0;
                    len--;
                    break;
                }
                possibleDups++;
            }
        }
        int last = len - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        new Solution().duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
