package nowcoder.od2023.interview2;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        String[] input = new String[]{"5", "2", "C", "D", "+"};
//        String[] input = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
//        String[] input = new String[]{"1"};
//        String[] input = new String[]{"+"};
        int res = sumScore(input);
        System.out.println(res);
    }

    private static int sumScore(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (isNumber(op) != Integer.MIN_VALUE) {
                stack.push(Integer.parseInt(op));
            } else if ("C".equals(op)) {
                if (stack.isEmpty()) return -1;
                stack.pop();
            } else if ("D".equals(op)) {
                if (stack.isEmpty()) return -1;
                int pop = stack.peek();
                stack.push(pop * 2);
            } else if ("+".equals(op)) {
                if (stack.isEmpty()) return -1;
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    private static int isNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE;
        }
    }
}
