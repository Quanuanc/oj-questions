package nowcoder.test5;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static Map<String, Integer> nameCountMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            parseInput(input);
        }


        for (String key : nameCountMap.keySet()) {
            System.out.println(key + " " + nameCountMap.get(key));
        }
    }

    public static void parseInput(String input) {
        String nameAndLine = input.substring(input.lastIndexOf('\\') + 1);
        String name = input.substring(input.lastIndexOf('\\') + 1, input.lastIndexOf(' '));
        if (name.length() > 16) {
            nameAndLine = nameAndLine.substring(name.length() - 16);
        }
        if (nameCountMap.containsKey(nameAndLine)) {
            int val = nameCountMap.get(nameAndLine);
            nameCountMap.put(nameAndLine, ++val);
        } else {
            nameCountMap.put(nameAndLine, 1);
        }
    }
}
