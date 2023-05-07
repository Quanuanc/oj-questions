package nowcoder.od2023.test1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @see <a href="https://wiki.amoscloud.com/zh/ProgramingPractice/NowCoder/Adecco/Topic0198">题目</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // 1. 统计每个牌号的数量
        // k -> v : 牌号 -> 牌数
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 2. 按照 牌数 > 牌号 的规则排序
        List<Map.Entry<Integer, Integer>> countList = new ArrayList<>(countMap.entrySet());
        countList.sort((a, b) -> {
            if (Objects.equals(b.getValue(), a.getValue())) {
                return b.getKey() - a.getKey();
            }
            return b.getValue() - a.getValue();
        });

        // 3. 遍历 countList，按照 炸弹 > 葫芦 > 三张 > 对子 > 单张 的规则来生成字符串
        StringBuilder result = new StringBuilder();
        List<Integer> pukeCards = new ArrayList<>(); //暂存由于凑葫芦而剩余的牌
        for (int i = 0; i < countList.size(); i++) {
            Map.Entry<Integer, Integer> entry = countList.get(i);
            int cardNum = entry.getKey(); //牌号
            int cardCount = entry.getValue(); //牌数

            if (i > 0 && countList.get(i - 1).getValue() == 3 && cardCount == 3) { //上一轮已经凑到了三张，这一轮也有三张，那就把这一轮的三张抽两张出来凑成葫芦
                pukeCards.add(cardNum);
                cardCount--;
                entry.setValue(cardCount);
            } else if (cardCount == 1 && !pukeCards.isEmpty()) { //如果本轮的牌为单张，就需要和暂存的牌先比较大小，大的先输出
                for (int k = 0; k < pukeCards.size(); k++) {
                    if (pukeCards.get(k) > cardNum) {
                        result.append(pukeCards.get(k)).append(" ");
                        pukeCards.remove(k);
                        k--;
                    }
                }
            }
            for (int j = 0; j < cardCount; j++) {
                result.append(cardNum).append(" ");
            }
        }
        if (!pukeCards.isEmpty()) {
            for (int card : pukeCards) {
                result.append(card).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
