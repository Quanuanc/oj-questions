package nowcoder.hwod;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] tree = new int[n];
        Arrays.fill(tree, 1);


        for (int i = 0; i < m; i++) {
            int input = sc.nextInt();
            tree[input - 1] = 0;
        }
        int k = sc.nextInt();

        int max = maxAlive(tree, k);
        System.out.println(max);
    }

    public static int maxAlive(int[] tree, int k) {
        return 1;
    }

//    public static int maxAlive(int[] tree, int k) {
//        int len = tree.length;
//        Map<Integer, Integer> notAliveMap = new HashMap<>();
//        int notLen = 0;
//        int notIndex = 0;
//        for (int i = 0; i < len; i++) {
//            if (tree[i] == 0) {
//                notIndex = i;
//                notLen++;
//            } else {
//                if (notIndex != 0 && notLen != 0)
//                    notAliveMap.put(notIndex, notLen);
//                notIndex = 0;
//                notLen = 0;
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : notAliveMap.entrySet()) {
//            int max = 0;
//            if (entry.getValue() == k) {
//                int[] newTree = Arrays.copyOf(tree, tree.length);
//                for (int i = entry.getKey(); i <= entry.getValue(); i++) {
//                    newTree[i] = 1;
//                    int newMax = countMaxAliveLen(newTree);
//                    if (newMax > max) {
//                        max = newMax;
//                    }
//                }
//                return max;
//            }
//        }
//        return 1;
//    }

//    public static int countMaxAliveLen(int[] tree) {
//        int max = 0;
//        int newMax = 0;
//        for (int j : tree) {
//            if (j == 1) {
//                newMax++;
//            } else {
//                if (newMax > max) {
//                    max = newMax;
//                    newMax = 0;
//                } else {
//                    newMax = 0;
//                }
//            }
//        }
//        return max;
//    }
}
