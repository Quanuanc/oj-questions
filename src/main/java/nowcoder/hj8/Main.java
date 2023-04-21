package nowcoder.hj8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        Map<Integer, Integer> map = new TreeMap<>();
        while (count > 0) {
            String line = in.nextLine();
            String[] inArray = line.split(" ");
            int key = Integer.parseInt(inArray[0]);
            int val = Integer.parseInt(inArray[1]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + val);
            } else {
                map.put(key, val);
            }
            count--;
        }

        map.forEach((k, v) -> System.out.printf("%d %d\n", k, v));
    }
}
